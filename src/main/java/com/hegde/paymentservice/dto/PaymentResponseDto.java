package com.hegde.paymentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class PaymentResponseDto {

    private int paymentId;
    private String paymentStatus;
    private String transactionId;
}
