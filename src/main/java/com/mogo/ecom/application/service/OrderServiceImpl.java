package com.mogo.ecom.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mogo.ecom.application.repository.OrderRepository;
import com.mogo.ecom.domain.model.StripePaymentDetails;
import com.mogo.ecom.domain.model.order.Order;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private PaymentService<StripePaymentDetails> paymentService;
	
	@Autowired
	private MessagingService messagingService;
	
	@Override
	public void processOrder(Order order, StripePaymentDetails paymentDetails) {
		orderRepository.create(order);
		paymentService.process(paymentDetails, order.getBill());
		messagingService.sendOrderToPrintery(order);
	}

}
