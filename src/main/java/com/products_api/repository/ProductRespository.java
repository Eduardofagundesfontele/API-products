package com.products_api.repository;

import com.products_api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRespository extends JpaRepository<Product,String> {

    List<Product> findByName(String name);
}
