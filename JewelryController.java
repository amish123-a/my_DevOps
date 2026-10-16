package com.jewelry.shop.controller;

import com.jewelry.shop.model.JewelryItem;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/jewelry")
public class JewelryController {

    private List<JewelryItem> items = new ArrayList<>();

    public JewelryController() {
        items.add(new JewelryItem(1L, "Золотое кольцо", "Золото 585", 45000.0, 10));
        items.add(new JewelryItem(2L, "Серебряные серьги", "Серебро 925", 3500.0, 25));
        items.add(new JewelryItem(3L, "Колье с рубином", "Платина", 120000.0, 3));
    }

    @GetMapping
    public List<JewelryItem> getAllItems() {
        return items;
    }

    @GetMapping("/{id}")
    public JewelryItem getItemById(@PathVariable Long id) {
        return items.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public JewelryItem addItem(@RequestBody JewelryItem newItem) {
        items.add(newItem);
        return newItem;
    }
}