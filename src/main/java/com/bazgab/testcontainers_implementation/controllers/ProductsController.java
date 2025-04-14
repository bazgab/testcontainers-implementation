package com.bazgab.testcontainers_implementation.controllers;


import com.bazgab.testcontainers_implementation.models.Products;
import com.bazgab.testcontainers_implementation.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductsController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/getAllProducts")
    public ResponseEntity<List<Products>> getAllProducts() {
        try {
            List<Products> productsList;
            productsList = new ArrayList<>();
            productRepository.findAll().forEach(productsList::add);
            if (productsList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            } else {
                return new ResponseEntity<>(productsList, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/addProduct")
    public ResponseEntity<Products> addProduct(@RequestBody Products products) {

        try {
            Products products1 = productRepository.save(products);
            return new ResponseEntity<>(products1, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
