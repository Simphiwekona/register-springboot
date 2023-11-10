package com.example.backend.service.impl;

import com.example.backend.dto.ProductDto;
import com.example.backend.entity.Products;
import com.example.backend.repository.ProductRepo;
import com.example.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

  @Autowired
  private ProductRepo productRepo;

  @Override
    public String addProduct(ProductDto productDto){
      Products products = new Products(
              productDto.getProduct_id(),
              productDto.getProduct_name(),
              productDto.getProduct_model()
      );
        productRepo.save(products);
        return products.getProduct_name();
  }
}
