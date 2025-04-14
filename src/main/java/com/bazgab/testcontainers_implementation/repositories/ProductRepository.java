package com.bazgab.testcontainers_implementation.repositories;

import com.bazgab.testcontainers_implementation.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Long> {



}
