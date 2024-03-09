package com.nsbm.medicalinventorymanagementsystem.service;

import com.nsbm.medicalinventorymanagementsystem.model.ItemType;

import java.util.List;

public interface ItemTypeService {
    void saveItemType(ItemType itemType);

    ItemType getItemTypeByName(String name);

    List<ItemType> getAllItemTypes();

    String validateItemTypeByName(String name);
}
