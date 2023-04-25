package com.co.product.MSProduct.domain;


import javax.persistence.*;
import lombok.Getter;


@Entity
@Table (name= "products")
@Getter
@Sette
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @Column (name="brand")
    private String brand;
    @Column (name="name")
    private String name;

    public Product(){

    }

    public Product(long id, String brand, String name){
        this.id = id;
        this.brand = brand;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
