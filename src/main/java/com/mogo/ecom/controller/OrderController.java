package com.mogo.ecom.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mogo.ecom.application.service.OrderService;
import com.mogo.ecom.domain.model.Client;
import com.mogo.ecom.domain.model.StripePaymentDetails;
import com.mogo.ecom.domain.model.order.Order;
import com.mogo.ecom.domain.model.order.OrderFactory;

@Controller
public class OrderController {
	
	@Autowired
	private OrderFactory orderFactory;
	
	@Autowired
	private OrderService orderService;
	
    @RequestMapping(value="/order", method = RequestMethod.POST)
    public String order(ModelMap model, HttpServletRequest request) {
    	String firstName = request.getParameter("firstName");
    	String lastName = request.getParameter("lastName");
    	Client client = new Client(firstName, lastName);
    	String token = request.getParameter("stripeToken");
    
    	StripePaymentDetails paymentDetails = new StripePaymentDetails(client, token);
    	
    	Order order = orderFactory.createOrder(null, null, null, null);
    	orderService.processOrder(order, paymentDetails);
        return "index";
    }

}
