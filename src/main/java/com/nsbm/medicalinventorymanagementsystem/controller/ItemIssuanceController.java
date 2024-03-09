package com.nsbm.medicalinventorymanagementsystem.controller;

import com.nsbm.medicalinventorymanagementsystem.service.BorrowerService;
import com.nsbm.medicalinventorymanagementsystem.service.ItemService;
import com.nsbm.medicalinventorymanagementsystem.service.impl.ItemIssuanceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ItemIssuanceController {

    @Autowired
    private ItemIssuanceServiceImpl itemIssuanceService;

    @Autowired
    private ItemService itemService;

    @Autowired
    private BorrowerService borrowerService;

    @GetMapping("/ItemIssuanceView")
    public String View(Model model) {
        return "/Item Issuance/View";
    }

    @GetMapping("/ItemIssuanceCreate")
    public String Create(Model model) {
        return "/Item Issuance/Create";
    }

    @GetMapping("/ItemIssuanceEdit/{id}")
    public String Edit(@PathVariable(value = "id") long id, Model model) {
        return "/Item Issuance/Edit";
    }

    @GetMapping("/ItemIssuanceDelete/{id}")
    public String Delete(@PathVariable(value = "id") long id, Model model) {
        return "/Item Issuance/Delete";
    }

}
