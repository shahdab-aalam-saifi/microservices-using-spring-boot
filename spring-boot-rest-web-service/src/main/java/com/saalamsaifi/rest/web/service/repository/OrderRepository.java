package com.saalamsaifi.rest.web.service.repository;

import com.saalamsaifi.rest.web.service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}
