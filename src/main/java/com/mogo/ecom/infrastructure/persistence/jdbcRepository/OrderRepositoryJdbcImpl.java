package com.mogo.ecom.infrastructure.persistence.jdbcRepository;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.mogo.ecom.application.repository.OrderRepository;
import com.mogo.ecom.domain.model.order.Order;

@Repository
public class OrderRepositoryJdbcImpl implements OrderRepository{

	@Override
	public UUID create(Order entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Order entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Order entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Order find(UUID key) {
		// TODO Auto-generated method stub
		return null;
	}

}
