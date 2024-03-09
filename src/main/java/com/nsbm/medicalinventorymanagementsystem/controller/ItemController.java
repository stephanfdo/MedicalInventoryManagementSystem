package com.nsbm.medicalinventorymanagementsystem.controller;

import com.nsbm.medicalinventorymanagementsystem.service.ItemTypeService;
import com.nsbm.medicalinventorymanagementsystem.service.VendorService;
import com.nsbm.medicalinventorymanagementsystem.service.impl.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ItemController {

    @Autowired
    private ItemServiceImpl itemService;

    @Autowired
    private ItemTypeService itemTypeService;

    @Autowired
    private VendorService vendorService;

    @GetMapping("/ItemView")
    public String View(Model model) {
        return "/Item/View";
    }

    @GetMapping("/ItemCreate")
    public String Create(Model model) {
        return "/Item/Create";
    }

    @GetMapping("/ItemEdit/{id}")
    public String Edit(@PathVariable(value = "id") long id, Model model) {
        return "/Item/Edit";
    }

    @GetMapping("/ItemDelete/{id}")
    public String Delete(@PathVariable(value = "id") long id, Model model) {
        return "/Item/Delete";
    }
}
