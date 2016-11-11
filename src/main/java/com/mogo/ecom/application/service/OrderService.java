package com.mogo.ecom.application.service;

import com.mogo.ecom.domain.model.StripePaymentDetails;
import com.mogo.ecom.domain.model.order.Order;

public interface OrderService {
	
	public void processOrder(Order order, StripePaymentDetails paymentDetails);

}
