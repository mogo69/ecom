package com.mogo.ecom.application.service;

import com.mogo.ecom.domain.model.order.Order;

public interface MessagingService {

	public void sendOrderToPrintery(Order order);
}
