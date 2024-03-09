package com.nsbm.medicalinventorymanagementsystem.service;

import com.nsbm.medicalinventorymanagementsystem.model.ItemRepair;

import java.util.List;

public interface ItemRepairService {
    List<ItemRepair> getAllRepairItems();

    void saveItemRepair(ItemRepair itemRepair);

    void deleteItemRepairById(long id);

    ItemRepair findItemRepairById(long id);
}