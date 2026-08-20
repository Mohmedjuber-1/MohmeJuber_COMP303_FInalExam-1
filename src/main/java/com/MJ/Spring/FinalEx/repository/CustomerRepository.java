package com.MJ.Spring.FinalEx.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.MJ.Spring.FinalEx.Model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}