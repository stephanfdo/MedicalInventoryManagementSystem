package com.nsbm.mims.controller;

import com.nsbm.mims.model.Inventory;
import com.nsbm.mims.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @PostMapping
    public ResponseEntity<Inventory> addToInventory(@RequestBody Inventory inventory) {
        Inventory updatedInventory = inventoryService.addToInventory(inventory);
        return new ResponseEntity<>(updatedInventory, HttpStatus.CREATED);
    }

    @DeleteMapping("/{itemId}")
    public ResponseEntity<Inventory> removeFromInventory(@RequestBody Inventory inventory) {
        Inventory updatedInventory = inventoryService.removeFromInventory(inventory);
        return new ResponseEntity<>(updatedInventory, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> viewInventory() {
        return new ResponseEntity<>(inventoryService.viewInventory(), HttpStatus.OK);
    }

    @PutMapping("/{itemId}")
    public ResponseEntity<Inventory> updateInventory(@PathVariable Long itemId, @RequestBody Inventory inventoryDetails) {
        Inventory updatedInventory = inventoryService.updateInventory(itemId, inventoryDetails);
        return new ResponseEntity<>(updatedInventory, HttpStatus.OK);
    }
}
