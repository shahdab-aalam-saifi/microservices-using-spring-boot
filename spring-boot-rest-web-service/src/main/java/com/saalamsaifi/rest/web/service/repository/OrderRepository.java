package com.saalamsaifi.rest.web.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saalamsaifi.rest.web.service.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}