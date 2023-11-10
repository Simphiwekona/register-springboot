package com.example.backend.entity;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Products {

    @Id
    @Column(name = "product_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long product_id;

    @Column(name = "product_name", length = 255)
    private String product_name;

    @Column(name = "product_model", length = 255)
    private String product_model;

    public Products() {
    }

    public Products(Long product_id, String product_name, String product_model) {
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
}
