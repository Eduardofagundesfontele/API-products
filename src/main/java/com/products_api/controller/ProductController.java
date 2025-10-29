package com.products_api.controller;

import com.products_api.model.Product;
import com.products_api.repository.ProductRespository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductRespository productRespository;

    public ProductController(ProductRespository productRespository) {
        this.productRespository = productRespository;
    }

    @PostMapping
    public Product save(@RequestBody Product product){
        System.out.println("Product received" + product);
       var id =  UUID.randomUUID().toString();
       product.setId(id);
        productRespository.save(product);
         return product;
    }
    @GetMapping ("/{id}")
    public Product byId(@PathVariable("id") String id){
        return productRespository.findById(id).orElse(null);

    }
   @DeleteMapping ("/{id}")
    public void delete(@PathVariable("id") String id){
        productRespository.deleteById(id);

    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String id,
                       @RequestBody Product product){
        product.setId(id);
        productRespository.save(product);

    }


}
