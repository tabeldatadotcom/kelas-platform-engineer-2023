package com.maryanto.dimas.example.kelasplatformengineer.controller;

import com.maryanto.dimas.example.kelasplatformengineer.model.Products;
import com.maryanto.dimas.example.kelasplatformengineer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping({"/", "/list"})
    public ResponseEntity<?> listProducts() {
        List<Products> list = this.productService.getAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") String id) {
        Optional<Products> optional = this.productService.findById(id);
        if (optional.isEmpty()) return ResponseEntity.noContent().build();
        else return ResponseEntity.ok(optional.get());
    }

    @PostMapping("/save")
    public ResponseEntity<?> newProduct(@RequestBody Products product) {
        product = this.productService.save(product);
        return ResponseEntity.ok(product);
    }

    @DeleteMapping("/findById/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") String id) {
        this.productService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
