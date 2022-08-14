package com.hegde.paymentservice.service;

import com.hegde.paymentservice.dto.PaymentRequestDto;
import com.hegde.paymentservice.dto.PaymentResponseDto;
import com.hegde.paymentservice.entity.Payment;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {

    PaymentResponseDto makePayment(PaymentRequestDto paymentRequest);

}
