package com.nsbm.medicalinventorymanagementsystem.controller;

import com.nsbm.medicalinventorymanagementsystem.service.BorrowerService;
import com.nsbm.medicalinventorymanagementsystem.service.impl.ItemIssuanceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FineController {

    @Autowired
    private BorrowerService borrowerService;

    @Autowired
    private ItemIssuanceServiceImpl itemIssuanceService;

    @GetMapping("/FineView")
    public String Index(Model model) {
        return "/Fine/View";
    }

    @GetMapping("/FineCreate")
    public String Create(Model model) {
        return "/Fine/Create";
    }
}
