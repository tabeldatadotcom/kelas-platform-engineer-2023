package com.maryanto.dimas.example.kelasplatformengineer.controller;

import com.maryanto.dimas.example.kelasplatformengineer.model.Products;
import com.maryanto.dimas.example.kelasplatformengineer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping({"/", "/list"})
    public ResponseEntity<?> listProducts() {
        List<Products> list = this.productService.getAll();
        return ResponseEntity.ok(list);
    }
}
