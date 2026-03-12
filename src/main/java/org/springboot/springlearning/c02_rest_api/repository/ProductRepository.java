package org.springboot.springlearning.c02_rest_api.repository;

import org.springboot.springlearning.c02_rest_api.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}