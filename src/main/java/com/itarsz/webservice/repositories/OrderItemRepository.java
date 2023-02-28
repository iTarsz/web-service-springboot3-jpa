package com.itarsz.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itarsz.webservice.entities.OrderItem;
import com.itarsz.webservice.entities.User;

public interface  OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
