package com.MJ.Spring.FinalEx.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.MJ.Spring.FinalEx.Model.Payment;

public interface PaymentRepository extends MongoRepository<Payment, String> {
}