package com.example.backend.controller;


import com.example.backend.dto.ProductDto;
import com.example.backend.dto.UserDto;
import com.example.backend.service.ProductService;
import com.example.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @PostMapping(path = "/save")
    public String saveUser(@RequestBody UserDto userDto){
        String id = String.valueOf(userService.addUser(userDto));
        return id;
    }

    @PostMapping(path = "/save/product")
    public String saveProduct(@RequestBody ProductDto productDto){
        String products_id = productService.addProduct(productDto);
        return products_id;
    }
}
