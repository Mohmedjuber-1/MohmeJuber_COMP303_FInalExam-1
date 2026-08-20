package com.MJ.Spring.FinalEx.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.MJ.Spring.FinalEx.Model.Ticket;

public interface TicketRepository extends MongoRepository<Ticket, String> {
}