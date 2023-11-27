package com.acc.training.customerapi.service;


import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.training.customerapi.domain.Customer;
import com.acc.training.customerapi.repository.CustomerRepository;



@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer); 
	}
	
	public List<Customer> getCustomers() {
		return customerRepository.findAll();
		
	}
	
	public Customer getCustomerById(int id) {
		Optional<Customer> optional = customerRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get(); 
		} else {
			throw new ObjectNotFoundException(optional, "customer");
		}
	}
}
