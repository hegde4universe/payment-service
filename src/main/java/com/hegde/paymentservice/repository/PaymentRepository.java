package com.hegde.paymentservice.repository;

import com.hegde.paymentservice.dto.PaymentResponseDto;
import com.hegde.paymentservice.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
    PaymentResponseDto findByOrderId(int orderId);
}
