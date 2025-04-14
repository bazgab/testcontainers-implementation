package com.bazgab.testcontainers_implementation.repositories;

import com.bazgab.testcontainers_implementation.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Products, Long> {



}
