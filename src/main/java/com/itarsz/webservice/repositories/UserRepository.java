package com.itarsz.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itarsz.webservice.entities.User;

public interface  UserRepository extends JpaRepository<User, Long>{

}
