package com.example.modulithdemo.order.website;

import com.example.modulithdemo.payment.PaymentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.modulith.test.ApplicationModuleTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.BDDMockito.given;

@ApplicationModuleTest
class WebsiteOrderServiceTest {

    @MockBean
    private PaymentService paymentService;
    @Autowired
    private  WebsiteOrderService websiteOrderService;

    @Test
    void order_shouldNotThrow() {
        given(paymentService.pay("margarita")).willReturn(true);
        assertDoesNotThrow(() -> websiteOrderService.order("margarita"));
    }

}
