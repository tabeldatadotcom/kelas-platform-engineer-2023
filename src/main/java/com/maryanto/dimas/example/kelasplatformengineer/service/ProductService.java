package com.maryanto.dimas.example.kelasplatformengineer.service;

import com.maryanto.dimas.example.kelasplatformengineer.model.Products;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public List<Products> getAll() {
        List<Products> list = new ArrayList<>();
        list.add(Products.builder()
                .productId("mbp13-2017-touchbar")
                .productName("Macbook Pro 13\" (touchbar - 2017)")
                .productDesc("Laptop Apple Macbook series")
                .price(new BigDecimal(23_000_000))
                .lastUpdated(LocalDateTime.of(2017, Month.NOVEMBER, 15, 00, 00))
                .build());
        list.add(Products.builder()
                .productId("mbp15-2018-touchbar")
                .productName("Macbook Pro 15\" (touchbar - 2018)")
                .productDesc("Laptop Apple Macbook series")
                .price(new BigDecimal(32_000_000))
                .lastUpdated(LocalDateTime.of(2018, Month.MARCH, 10, 00, 00))
                .build());
        return list;
    }
}
