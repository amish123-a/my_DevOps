package com.jewelry.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JewelryApplication {
    public static void main(String[] args) {
        SpringApplication.run(JewelryApplication.class, args);
        System.out.println("Jewelry Shop API запущен на порту 8080");
    }
}