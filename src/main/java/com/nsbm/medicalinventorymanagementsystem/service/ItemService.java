package com.nsbm.medicalinventorymanagementsystem.service;

import com.nsbm.medicalinventorymanagementsystem.model.Item;

import java.util.List;

public interface ItemService {
    Item getItemById(long id);

    String validateItemId(long id);

    long findItemIdByLoanId(long loanId);

    List<Item> getAllItems();

    void saveItem(Item item);

    String validateItemId(String itemName, String itemType);

    void deleteItem(long itemId);
}
