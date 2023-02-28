package com.itarsz.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itarsz.webservice.entities.Order;

public interface  OrderRepository extends JpaRepository<Order, Long>{

}
