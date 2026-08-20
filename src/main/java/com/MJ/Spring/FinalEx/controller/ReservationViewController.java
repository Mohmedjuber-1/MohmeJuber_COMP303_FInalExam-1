package com.MJ.Spring.FinalEx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.MJ.Spring.FinalEx.Model.Reservation;
import com.MJ.Spring.FinalEx.repository.ReservationRepository;

@Controller
public class ReservationViewController {

    private final ReservationRepository reservationRepository;

    public ReservationViewController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    // Shows the "Fill your Details" form
    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        return "reservation-form";
    }

    // Handles the "Next" button submit
    @PostMapping("/reservation/submit")
    public String submitForm(@ModelAttribute Reservation reservation, Model model) {
        Reservation saved = reservationRepository.save(reservation);
        model.addAttribute("reservation", saved);
        return "reservation-result";
    }
}