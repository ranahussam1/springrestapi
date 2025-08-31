package com.springrestapi.springrestapi;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class ProductController {
    @Autowired
    ProductRepository productRepository;

   
    @GetMapping("/products")
    public List <Products> getallProducts(){
        return productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    public Products getProduct(@PathVariable("id") int id){
        return productRepository.findById(id).get();
    }

    @PostMapping("/products")
    public Products createProduct(@RequestBody Products product) {        
        return productRepository.save(product);
    }
    
    @PutMapping("/products")
    public Products modifyProduct(@RequestBody Products product) {
        return productRepository.save(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable("id") int id){
        productRepository.deleteById(id);
    }

}
