package com.example.modulithdemo.order.partner;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.modulith.test.ApplicationModuleTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@ApplicationModuleTest
class PartnerAppOrderServiceTest {

    @Autowired
    private PartnerAppOrderService partnerAppOrderService;

    @Test
    void order_shouldNotThrow() {
        // Application Context fails to load because of the missing PaymentService bean
        // But it should not because the PaymentService bean is not used in the PartnerAppOrderService module
        assertDoesNotThrow(() -> partnerAppOrderService.order("margarita"));
    }

}
