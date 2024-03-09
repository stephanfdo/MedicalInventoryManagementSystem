package com.nsbm.medicalinventorymanagementsystem.repository;

import com.nsbm.medicalinventorymanagementsystem.model.ItemType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemTypeRepository extends JpaRepository<ItemType, Long> {

}