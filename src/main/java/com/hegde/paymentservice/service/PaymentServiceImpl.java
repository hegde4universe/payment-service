package com.hegde.paymentservice.service;

import com.hegde.paymentservice.dto.PaymentRequestDto;
import com.hegde.paymentservice.dto.PaymentResponseDto;
import com.hegde.paymentservice.entity.Payment;
import com.hegde.paymentservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.UUID;

@Component
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public PaymentResponseDto makePayment(PaymentRequestDto paymentRequest) {
        Payment payment = new Payment();
        payment.setOrderId(paymentRequest.getOrderId());
        payment.setAmount(paymentRequest.getAmount());
        payment.setTransactionId(UUID.randomUUID().toString());
        payment.setPaymentStatus(new Random().nextBoolean() ? "SUCCESS" : "FAILURE");
        paymentRepository.save(payment);
        return PaymentResponseDto.builder().paymentStatus(payment.getPaymentStatus())
                                           .transactionId(payment.getTransactionId())
                                           .build();
    }

    @Override
    public PaymentResponseDto getPaymentHistoryByOrderId(int orderId) {
        return paymentRepository.findByOrderId(orderId);

    }
}
