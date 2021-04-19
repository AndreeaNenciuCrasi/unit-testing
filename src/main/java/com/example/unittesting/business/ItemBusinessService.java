package com.example.unittesting.business;

import com.example.unittesting.model.Item;
import com.example.unittesting.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemBusinessService {

    @Autowired
    private ItemRepository itemRepository;

    public Item retreiveHardcodedItem() {
        return new Item(1, "Ball", 10, 100);
    }

    public List<Item> retrieveAllItems(){
        List<Item> items = itemRepository.findAll();
        for(Item item: items){
            item.setValue(item.getPrice()*item.getQuantity());
        }
        return items;
    }
}
