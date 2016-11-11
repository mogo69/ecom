package com.mogo.ecom.domain.model.order;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.mogo.ecom.domain.model.Bill;
import com.mogo.ecom.domain.model.Client;
import com.mogo.ecom.domain.model.Currency;
import org.springframework.stereotype.Component;

@Component
public class OrderFactory {
	
	public Order createOrder(Client client, List<MultipartFile> crunchifyFiles, boolean[][] printWithColor, Currency currency) {
		// Main task of this factory to process all files which client attached to this order 
		// convert them to pdf, upload to special storage, create bill for customer etc
		// in future this factory will be using other services to accomplish this task
		
		List<Document> documents = null;
		Bill bill = null;
		return new Order(client, documents, bill);
	}

}
