package com.abcode.ecommerce.service;

import com.abcode.ecommerce.dto.Purchase;
import com.abcode.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
