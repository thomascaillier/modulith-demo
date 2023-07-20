package com.example.modulithdemo.payment;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public boolean pay(String pizza) {
        return !pizza.equals("pineapple");
    }
}
