package com.maryanto.dimas.example.kelasplatformengineer.repository;

import com.maryanto.dimas.example.kelasplatformengineer.model.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Products, String> {
}
