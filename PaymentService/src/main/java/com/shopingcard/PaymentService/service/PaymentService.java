package com.shopingcard.PaymentService.service;

import com.shopingcard.PaymentService.model.PaymentRequest;
import com.shopingcard.PaymentService.model.PaymentResponse;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(String orderId);
}
