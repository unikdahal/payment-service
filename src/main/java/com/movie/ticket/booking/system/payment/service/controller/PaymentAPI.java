package com.movie.ticket.booking.system.payment.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentAPI {
    @GetMapping
    public String test() {
        return "test";
    }
}
