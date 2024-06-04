package com.diplomado.CircuitBreaker.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diplomado.CircuitBreaker.service.IEmailService;
import com.diplomado.CircuitBreaker.service.EmailService;

@RestController
public class EmailController {

    private final IEmailService EmailService;

    @Autowired
    public EmailController(EmailService EmailService) {
        this.EmailService = EmailService;
    }

    @GetMapping("/processEmail")
    @CircuitBreaker(name = "processEmail", fallbackMethod = "fallbackMethod")
    public String processEmail() throws Exception {
            return EmailService.processEmail();
    }

    public String fallbackMethod(Throwable throwable) {
        return "Lo sentimos, actualmente los envios de email no estan disponible. Por favor, inténtalo de nuevo más tarde.";
    }
}