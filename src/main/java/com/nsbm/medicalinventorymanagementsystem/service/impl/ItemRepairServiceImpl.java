package com.nsbm.medicalinventorymanagementsystem.service.impl;

import com.nsbm.medicalinventorymanagementsystem.model.ItemRepair;
import com.nsbm.medicalinventorymanagementsystem.repository.ItemRepairRepository;
import com.nsbm.medicalinventorymanagementsystem.service.ItemRepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemRepairServiceImpl implements ItemRepairService {

    @Autowired
    private ItemRepairRepository itemRepairRepository;

    @Override
    public List<ItemRepair> getAllRepairItems() {
        return null;
    }

    @Override
    public void saveItemRepair(ItemRepair itemRepair) {

    }

    @Override
    public void deleteItemRepairById(long id) {

    }

    @Override
    public ItemRepair findItemRepairById(long id) {
        return null;
    }
}
