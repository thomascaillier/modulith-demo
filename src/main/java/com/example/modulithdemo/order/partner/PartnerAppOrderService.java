package com.example.modulithdemo.order.partner;

import org.springframework.stereotype.Service;

@Service
public class PartnerAppOrderService {

    public void order(String pizza){
        System.out.println("Prepare pizza '" + pizza + "' for a partner application order");
    }

}
