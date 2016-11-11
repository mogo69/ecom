package com.mogo.ecom.infrastructure.messaging;

import org.springframework.stereotype.Service;

import com.mogo.ecom.application.service.MessagingService;
import com.mogo.ecom.domain.model.order.Order;

@Service
public class MessagingServiceSocketsImpl implements MessagingService{

	@Override
	public void sendOrderToPrintery(Order order) {
		// TODO Auto-generated method stub
		
	}

}
