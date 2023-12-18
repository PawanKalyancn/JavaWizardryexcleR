package com.excler.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excler.entity.Orders.Order;

public interface OrderRespotory extends JpaRepository<Order, Integer> {

}
