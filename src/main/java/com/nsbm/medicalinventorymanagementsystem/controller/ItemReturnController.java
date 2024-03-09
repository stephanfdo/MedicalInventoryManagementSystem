package com.nsbm.medicalinventorymanagementsystem.controller;

import com.nsbm.medicalinventorymanagementsystem.service.impl.BorrowerServiceImpl;
import com.nsbm.medicalinventorymanagementsystem.service.impl.ItemIssuanceServiceImpl;
import com.nsbm.medicalinventorymanagementsystem.service.impl.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemReturnController {

    @Autowired
    private BorrowerServiceImpl borrowerService;

    @Autowired
    private ItemServiceImpl itemService;

    @Autowired
    private ItemIssuanceServiceImpl itemIssuanceService;

    @GetMapping("/ItemReturnView")
    public String Index(Model model) {
        return "/Item Return/View";
    }

    @GetMapping("/ItemReturnCreate")
    public String Create(Model model) {
        return "/Item Return/Create";
    }
}
