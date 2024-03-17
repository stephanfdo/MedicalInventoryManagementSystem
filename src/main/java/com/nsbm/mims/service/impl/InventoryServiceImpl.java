package com.nsbm.mims.service.impl;

import com.nsbm.mims.model.Inventory;
import com.nsbm.mims.repository.InventoryRepository;
import com.nsbm.mims.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Override
    public Inventory addToInventory(Inventory inventory) {
        // Check if the item already exists in inventory
        Inventory existingItem = inventoryRepository.findByItemId(inventory.getItemId());
        if (existingItem != null) {
            // If item exists, update its quantity
            existingItem.setQuantity(existingItem.getQuantity() + inventory.getQuantity());
            return inventoryRepository.save(existingItem);
        } else {
            // If item doesn't exist, save it to inventory
            return inventoryRepository.save(inventory);
        }
    }


    @Override
    public Inventory removeFromInventory(Inventory inventory) {
        // Check if the item exists in inventory
        Inventory existingItem = inventoryRepository.findByItemId(inventory.getItemId());
        if (existingItem != null) {
            // If item exists, update its quantity
            int updatedQuantity = existingItem.getQuantity() - inventory.getQuantity();
            if (updatedQuantity >= 0) {
                existingItem.setQuantity(updatedQuantity);
                return inventoryRepository.save(existingItem);
            } else {
                // If quantity to remove exceeds available quantity, throw exception or handle accordingly
                throw new IllegalArgumentException("Insufficient quantity in inventory.");
            }
        } else {
            // If item doesn't exist, throw exception or handle accordingly
            throw new IllegalArgumentException("Item not found in inventory.");
        }
    }


    @Override
    public List<Inventory> viewInventory() {
        return inventoryRepository.findAll();
    }


    @Override
    public Inventory updateInventory(Long itemId, Inventory inventoryDetails) {
        // Check if the item exists in inventory
        Inventory existingItem = inventoryRepository.findByItemId(itemId);
        if (existingItem != null) {
            // If item exists, update its details
            existingItem.setQuantity(inventoryDetails.getQuantity());
            // Update other fields as needed
            return inventoryRepository.save(existingItem);
        } else {
            // If item doesn't exist, throw exception or handle accordingly
            throw new IllegalArgumentException("Item not found in inventory.");
        }
    }

}