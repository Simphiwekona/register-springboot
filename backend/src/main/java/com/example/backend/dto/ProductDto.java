package com.example.backend.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ProductDto {


    private Long product_id;
    private String product_name;
    private String product_model;

    public ProductDto() {
    }

    public ProductDto(Long product_id, String product_name, String product_model) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_model = product_model;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_model() {
        return product_model;
    }

    public void setProduct_model(String product_model) {
        this.product_model = product_model;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_model='" + product_model + '\'' +
                '}';
    }
}
