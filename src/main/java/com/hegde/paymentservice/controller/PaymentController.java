package com.hegde.paymentservice.controller;

import com.hegde.paymentservice.dto.PaymentRequestDto;
import com.hegde.paymentservice.dto.PaymentResponseDto;
import com.hegde.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/makePayment")
    public PaymentResponseDto createPayment(@RequestBody PaymentRequestDto paymentRequest) {
        return paymentService.makePayment(paymentRequest);
    }
}
