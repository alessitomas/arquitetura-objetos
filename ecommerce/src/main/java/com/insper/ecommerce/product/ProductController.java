package com.insper.ecommerce.product;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService = new ProductService();

    @GetMapping("")
    public List<Product> getProducts(){
        return productService.listProducts();
    }
    
    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Product saveProduct(@RequestBody Product product){
        productService.saveProduct(product);
        return product;
   }
}
