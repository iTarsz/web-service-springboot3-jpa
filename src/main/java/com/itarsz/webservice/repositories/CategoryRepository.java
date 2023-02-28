package com.itarsz.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itarsz.webservice.entities.Category;

public interface  CategoryRepository extends JpaRepository<Category, Long>{

}
