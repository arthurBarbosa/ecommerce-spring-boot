package com.abcode.ecommerce.dto;

import com.abcode.ecommerce.entity.Address;
import com.abcode.ecommerce.entity.Customer;
import com.abcode.ecommerce.entity.OrderItem;
import com.abcode.ecommerce.entity.Order;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
