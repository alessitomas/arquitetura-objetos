package com.insper.ecommerce.product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

// spring transforma a classe em singleton
// In Java, Singleton is a design pattern that ensures that a class can only have one object
@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public List<Product> listProducts(){
        return products;
    }

    public Product saveProduct(Product product){
        product.setId(UUID.randomUUID().toString());
        products.add(product);
        return product;

    }
    
}
