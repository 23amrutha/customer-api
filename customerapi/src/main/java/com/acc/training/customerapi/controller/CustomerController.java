package com.acc.training.customerapi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.acc.training.customerapi.domain.Customer;
import com.acc.training.customerapi.service.CustomerService;
 

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	
	@PostMapping("/customer")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
		customer = customerService.createCustomer(customer);
		return ResponseEntity.status(HttpStatus.CREATED).body(customer); 
		
	}

	@GetMapping("/customer")
	public ResponseEntity<List<Customer>> getCustomers() {
		List<Customer> customers = customerService.getCustomers();
		return ResponseEntity.status(HttpStatus.OK).body(customers);  
	}

	@GetMapping("/customer/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable int id){ 
		return ResponseEntity.ok(customerService.getCustomerById(id)); 
	}
}  
