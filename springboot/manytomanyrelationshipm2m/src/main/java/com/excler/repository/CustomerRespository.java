package com.excler.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excler.entity.Customer;

public interface CustomerRespository extends JpaRepository<Customer, Integer> {

}
