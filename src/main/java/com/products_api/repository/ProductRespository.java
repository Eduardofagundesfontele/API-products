package com.products_api.repository;

import com.products_api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRespository extends JpaRepository<Product,String> {
}
