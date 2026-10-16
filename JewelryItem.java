package com.jewelry.shop.model;

public class JewelryItem {
    private Long id;
    private String name;
    private String material;
    private double price;
    private int stockQuantity;

    public JewelryItem() {}

    public JewelryItem(Long id, String name, String material, double price, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.material = material;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getStockQuantity() { return stockQuantity; }
    public void setStockQuantity(int stockQuantity) { this.stockQuantity = stockQuantity; }
}