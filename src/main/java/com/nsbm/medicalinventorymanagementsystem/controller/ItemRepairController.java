package com.nsbm.medicalinventorymanagementsystem.controller;

import com.nsbm.medicalinventorymanagementsystem.service.ItemService;
import com.nsbm.medicalinventorymanagementsystem.service.VendorService;
import com.nsbm.medicalinventorymanagementsystem.service.impl.ItemRepairServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ItemRepairController {

    @Autowired
    private ItemRepairServiceImpl itemRepairService;
    @Autowired
    private VendorService vendorService;
    @Autowired
    private ItemService itemService;

    @GetMapping("/ItemRepairView")
    public String View(Model model) {
        return "/Item Repair/View";
    }

    @GetMapping("/ItemRepairCreate")
    public String Create(Model model) {
        return "/Item Repair/Create";
    }

    @GetMapping("/ItemRepairEdit/{id}")
    public String Edit(@PathVariable(value = "id") long id, Model model) {
        return "/Item Repair/Edit";
    }

    @GetMapping("/ItemRepairDelete/{id}")
    public String Delete(@PathVariable(value = "id") long id, Model model) {
        return "/Item Repair/Delete";
    }
}
