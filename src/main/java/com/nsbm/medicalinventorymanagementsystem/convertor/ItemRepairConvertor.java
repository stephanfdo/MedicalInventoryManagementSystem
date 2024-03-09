package com.nsbm.medicalinventorymanagementsystem.convertor;

import com.nsbm.medicalinventorymanagementsystem.dto.ItemRepairDto;
import com.nsbm.medicalinventorymanagementsystem.model.ItemRepair;
import com.nsbm.medicalinventorymanagementsystem.service.impl.ItemServiceImpl;
import com.nsbm.medicalinventorymanagementsystem.service.impl.VendorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ItemRepairConvertor {

    @Autowired
    private VendorServiceImpl vendorService;

    @Autowired
    private ItemServiceImpl itemService;

    public ItemRepairDto modelToDto(ItemRepair item) {
        long itemId = 0;
        if (item.getItem() != null) {
            itemId = item.getItem().getId();
        }
        long itemRepairId = item.getId();
        long vendorId = item.getVendor().getId();
        double itemPrice = item.getPrice();
        double repairCost = item.getCost();
        ItemRepairDto itemRepairDto = new ItemRepairDto(itemRepairId, itemId, vendorId, repairCost, itemPrice);
        return itemRepairDto;
    }

    public ItemRepair DtoToModel(ItemRepairDto item) {
        ItemRepair itemRepair = new ItemRepair();
        itemRepair.setId(item.getId());
        itemRepair.setCost(item.getRepairCost());
        itemRepair.setPrice(item.getPrice());
        itemRepair.setItem(itemService.getItemById(item.getItemId()));
        itemRepair.setVendor(vendorService.getVendorById(item.getVendorId()));
        return itemRepair;
    }

    public List<ItemRepairDto> modelToDto(List<ItemRepair> item) {
        List<ItemRepairDto> DtoList = new ArrayList<>();
        int size = item.size();
        for (int i = 0; i < size; i++) {
            DtoList.add(modelToDto(item.get(i)));
        }
        return DtoList;
    }

    public List<ItemRepair> DtoToModel(List<ItemRepairDto> item) {
        List<ItemRepair> itemList = new ArrayList<>();
        int size = item.size();
        for (int i = 0; i < size; i++) {
            itemList.add(DtoToModel(item.get(i)));
        }
        return itemList;
    }
}
