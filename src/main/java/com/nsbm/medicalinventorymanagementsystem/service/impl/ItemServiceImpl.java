package com.nsbm.medicalinventorymanagementsystem.service.impl;

import com.nsbm.medicalinventorymanagementsystem.model.Item;
import com.nsbm.medicalinventorymanagementsystem.model.Loan;
import com.nsbm.medicalinventorymanagementsystem.repository.ItemRepository;
import com.nsbm.medicalinventorymanagementsystem.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item getItemById(long id) {
        Optional<Item> optional = itemRepository.findById(id);
        Item item = null;
        if (optional.isPresent()) {
            item = optional.get();
        } else {
            // Exception
        }
        return item;
    }

    @Override
    public String validateItemId(long id) {
        String errorMessage = "";
        Item item = getItemById(id);
        if (item == null) {
            errorMessage = "Item id does not exist";
        }
        return errorMessage;
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public long findItemIdByLoanId(long loanId) {
        List<Item> itemList = getAllItems();
        List<Loan> loanList;
        boolean found = false;
        long itemId = -1;
        for (Item item : itemList) {
            loanList = item.getLoan();
            for (Loan loan : loanList) {
                if (loan.getId() == loanId) {
                    itemId = item.getId();
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        return itemId;
    }

    @Override
    public void saveItem(Item item) {
        itemRepository.save(item);
    }

    @Override
    public String validateItemId(String itemName, String itemType) {
        String errorMessage = "";
        List<Item> itemList = itemRepository.findAll();
        for (Item item : itemList) {
            if (item.getName().equalsIgnoreCase(itemName)
                    & item.getItemType().getTypeName().equalsIgnoreCase(itemType)) {
                errorMessage = "Item already exists in the database. Cannot add.";
            }
        }
        return errorMessage;
    }

    @Override
    public void deleteItem(long itemId) {
        Item item = getItemById(itemId);
        itemRepository.delete(item);
    }

}