package com.mogo.ecom.application.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.mogo.ecom.domain.model.Bill;
import com.mogo.ecom.domain.model.StripePaymentDetails;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;

@Service
public class PaymentServiceStripeImpl implements PaymentService<StripePaymentDetails>{

	@Override
	public void process(StripePaymentDetails paymentDetails, Bill bill) {
        try {
            // Create the charge
            Map<String, Object> chargeParams
                = new HashMap<String, Object>();
            chargeParams.put("amount", bill.getAmount());
            chargeParams.put("currency", bill.getCurrency().getCode());
            chargeParams.put("source", paymentDetails.getToken());
            chargeParams.put("description", "Charge for " + paymentDetails.getClient().getFirstName()+" "
            + paymentDetails.getClient().getLastName() + " accoding to order " + bill.getOrderUUID());
            
            Charge charge = Charge.create(chargeParams);
            System.out.println(charge.getId());
            
        } catch (StripeException e) {
         //////
        }
	}

}
