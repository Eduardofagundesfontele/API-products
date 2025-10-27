package com.products_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProductsApiApplication {
 @GetMapping("/hello")
	public String helloWord(){
	 return "hello word";
 }
	public static void main(String[] args) {
		SpringApplication.run(ProductsApiApplication.class, args);
	}

}
