package com.nsbm.medicalinventorymanagementsystem.service.impl;

import com.nsbm.medicalinventorymanagementsystem.model.ItemType;
import com.nsbm.medicalinventorymanagementsystem.repository.ItemTypeRepository;
import com.nsbm.medicalinventorymanagementsystem.service.ItemTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemTypeServiceImpl implements ItemTypeService {

    @Autowired
    private ItemTypeRepository itemTypeRepository;


    @Override
    public void saveItemType(ItemType itemType) {

    }

    @Override
    public ItemType getItemTypeByName(String name) {
        return null;
    }

    @Override
    public List<ItemType> getAllItemTypes() {
        return null;
    }

    @Override
    public String validateItemTypeByName(String name) {
        return null;
    }
}
