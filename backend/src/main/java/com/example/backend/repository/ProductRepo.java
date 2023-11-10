package com.example.backend.repository;

import com.example.backend.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Products, Long> {
}
