package com.mogo.ecom.application.service;

import com.mogo.ecom.domain.model.Bill;
import com.mogo.ecom.domain.model.PaymentDetails;

public interface PaymentService<PaymentDetailsType extends PaymentDetails>{

	public void process(PaymentDetailsType paymentDetails, Bill bill);
}
