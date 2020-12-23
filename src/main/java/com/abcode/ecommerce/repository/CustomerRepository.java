package com.abcode.ecommerce.repository;

import com.abcode.ecommerce.entity.Customer;
import com.abcode.ecommerce.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
