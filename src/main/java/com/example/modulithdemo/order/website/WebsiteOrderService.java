package com.example.modulithdemo.order.website;

import com.example.modulithdemo.payment.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WebsiteOrderService {

    private final PaymentService paymentService;

    public void order(String pizza){
        System.out.println("Ask payment for pizza '" + pizza + "' for website order");
        if(paymentService.pay(pizza)){
            System.out.println("Prepare pizza '" + pizza + "' for website order");
        } else {
            System.err.println("Payment failed for pizza '" + pizza + "' for website order");
        }
    }

}
