package com.acc.training.customerapi.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.acc.training.customerapi.domain.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer> {
    
}
