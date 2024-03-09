package com.nsbm.medicalinventorymanagementsystem.controller;

import com.nsbm.medicalinventorymanagementsystem.Utilities.Helper;
import com.nsbm.medicalinventorymanagementsystem.convertor.ItemIssuanceConvertor;
import com.nsbm.medicalinventorymanagementsystem.dto.ItemReturnDto;
import com.nsbm.medicalinventorymanagementsystem.model.Borrower;
import com.nsbm.medicalinventorymanagementsystem.model.Item;
import com.nsbm.medicalinventorymanagementsystem.model.Loan;
import com.nsbm.medicalinventorymanagementsystem.service.impl.BorrowerServiceImpl;
import com.nsbm.medicalinventorymanagementsystem.service.impl.ItemIssuanceServiceImpl;
import com.nsbm.medicalinventorymanagementsystem.service.impl.ItemServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ItemReturnController {

    @Autowired
    private BorrowerServiceImpl borrowerService;

    @Autowired
    private ItemServiceImpl itemService;

    @Autowired
    private ItemIssuanceServiceImpl itemIssuanceService;

    @Autowired
    private ItemIssuanceConvertor itemIssuanceConvertor;

    @GetMapping("/ItemReturnView")
    public String Index(Model model) {
        model.addAttribute("ItemIssuanceDtoList",
                itemIssuanceConvertor.modelToDto(itemIssuanceService.getAllReturnedItem()));
        return "/Item Return/View";
    }

    @GetMapping("/ItemReturnCreate")
    public String Create(Model model) {
        ItemReturnDto itemReturnDto = new ItemReturnDto();
        model.addAttribute("itemReturnDto", itemReturnDto);
        return "/Item Return/Create";
    }

    @PostMapping("/ItemReturnCreate")
    public String Create(@Valid @ModelAttribute("itemReturnDto") ItemReturnDto itemReturnDto, BindingResult result) {
        itemReturnDto.setReturnDate(Helper.getCurrentTime());
        Borrower borrower = null;
        Item item = null;
        Loan loan = null;

        String err = borrowerService.validateBorrowerId(itemReturnDto.getBorrowerId());
        if (!err.isEmpty()) {
            ObjectError error = new ObjectError("globalError", err);
            result.addError(error);
        } else {
            borrower = borrowerService.getBorrowerById(itemReturnDto.getBorrowerId());
        }
        err = itemService.validateItemId(itemReturnDto.getItemId());
        if (!err.isEmpty()) {
            ObjectError error = new ObjectError("globalError", err);
            result.addError(error);
        } else {
            item = itemService.getItemById(itemReturnDto.getItemId());
        }

        try {
            loan = itemIssuanceService.findItemIssued(borrower.getId(), item.getId());
            borrower.removeLoan(loan);
            item.removeLoan(loan);
            loan.setReturnDate();
            loan.calculateFine();
            item.increaseQuantity();
            itemService.saveItem(item);
            itemIssuanceService.saveItemIssued(loan);
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception Caught in Item Return Controller.");
            err = "Loan ID does not exist. Invalid input";
            ObjectError error = new ObjectError("globalError", err);
            result.addError(error);
        }
        if (result.hasErrors()) {
            return "/Item Return/Create";
        }
        return "redirect:/ItemReturnView";
    }
}
