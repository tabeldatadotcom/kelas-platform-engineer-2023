package com.maryanto.dimas.example.kelasplatformengineer.service;

import com.maryanto.dimas.example.kelasplatformengineer.model.Products;
import com.maryanto.dimas.example.kelasplatformengineer.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ProductService {

    private final ProductRepository productRepo;

    public ProductService(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    public List<Products> getAll() {
        Iterable<Products> list = this.productRepo.findAll();

        return StreamSupport.stream(list.spliterator(), false)
                .collect(Collectors.toList());
    }

    public Optional<Products> findById(String id) {
        return this.productRepo.findById(id);
    }

    public Products save(Products product) {
        return this.productRepo.save(product);
    }

    public void deleteById(String id) {
        this.productRepo.deleteById(id);
    }
}
