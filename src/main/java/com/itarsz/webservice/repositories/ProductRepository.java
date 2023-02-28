package com.itarsz.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itarsz.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
