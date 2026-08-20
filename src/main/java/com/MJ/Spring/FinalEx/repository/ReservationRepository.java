package com.MJ.Spring.FinalEx.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.MJ.Spring.FinalEx.Model.Reservation;

public interface ReservationRepository extends MongoRepository<Reservation, String> {
    // MongoRepository already gives us save(), findAll(), findById(), deleteById(), etc.
}