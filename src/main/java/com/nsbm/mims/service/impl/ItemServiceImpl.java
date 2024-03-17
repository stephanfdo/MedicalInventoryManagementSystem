package com.nsbm.mims.service.impl;

import com.nsbm.mims.model.Item;
import com.nsbm.mims.repository.ItemRepository;
import com.nsbm.mims.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item getItem(Long itemId) {
        return itemRepository.findById(itemId).orElse(null);
    }

    @Override
    public Item updateItem(Long itemId, Item itemDetails) {
        Item item = getItem(itemId);
        if (item == null)
            return null;

        // Update item details
        item.setName(itemDetails.getName());
        item.setPrice(itemDetails.getPrice());
        // Update other fields as needed

        return itemRepository.save(item);
    }

    @Override
    public void deleteItem(Long itemId) {
        itemRepository.deleteById(itemId);
    }
}