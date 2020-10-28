package com.abcode.ecommerce.repository;

import com.abcode.ecommerce.entity.Order;
import com.abcode.ecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
