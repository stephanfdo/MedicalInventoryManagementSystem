package com.nsbm.mims.repository;

import com.nsbm.mims.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    Inventory findByItemId(Long itemId);
}
