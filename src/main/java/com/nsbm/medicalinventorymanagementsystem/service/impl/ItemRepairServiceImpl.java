package com.nsbm.medicalinventorymanagementsystem.service.impl;

import com.nsbm.medicalinventorymanagementsystem.model.ItemRepair;
import com.nsbm.medicalinventorymanagementsystem.repository.ItemRepairRepository;
import com.nsbm.medicalinventorymanagementsystem.service.ItemRepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemRepairServiceImpl implements ItemRepairService {

    @Autowired
    private ItemRepairRepository itemRepairRepository;

    @Override
    public List<ItemRepair> getAllRepairItems() {
        return itemRepairRepository.findAll();
    }

    @Override
    public void saveItemRepair(ItemRepair itemRepair) {
        this.itemRepairRepository.save(itemRepair);
    }

    @Override
    public void deleteItemRepairById(long id) {
        this.itemRepairRepository.deleteById(id);
    }

    @Override
    public ItemRepair findItemRepairById(long id) {
        Optional<ItemRepair> optional = itemRepairRepository.findById(id);
        ItemRepair itemRepair = null;
        if (optional.isPresent()) {
            itemRepair = optional.get();
        } else {
            // Exception
        }
        return itemRepair;
    }

}
