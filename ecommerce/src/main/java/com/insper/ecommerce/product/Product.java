package com.insper.ecommerce.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String name;
    private Integer stock;
    private Float price;
    private String id;

    public Product(String name, Integer stock, Float price){
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

}
