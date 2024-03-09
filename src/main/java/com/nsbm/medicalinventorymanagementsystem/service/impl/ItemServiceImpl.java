package com.nsbm.medicalinventorymanagementsystem.service.impl;

import com.nsbm.medicalinventorymanagementsystem.model.Item;
import com.nsbm.medicalinventorymanagementsystem.repository.ItemRepository;
import com.nsbm.medicalinventorymanagementsystem.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item getItemById(long id) {
        return null;
    }

    @Override
    public String validateItemId(long id) {
        return null;
    }

    @Override
    public long findItemIdByLoanId(long loanId) {
        return 0;
    }

    @Override
    public List<Item> getAllItems() {
        return null;
    }

    @Override
    public void saveItem(Item item) {

    }

    @Override
    public String validateItemId(String itemName, String itemType) {
        return null;
    }

    @Override
    public void deleteItem(long itemId) {

    }
}
