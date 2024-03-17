package com.nsbm.mims.service;

import com.nsbm.mims.model.Inventory;

import java.util.List;

public interface InventoryService {
    Inventory addToInventory(Inventory inventory);

    Inventory removeFromInventory(Inventory inventory);

    List<Inventory> viewInventory();

    Inventory updateInventory(Long itemId, Inventory inventoryDetails);
}