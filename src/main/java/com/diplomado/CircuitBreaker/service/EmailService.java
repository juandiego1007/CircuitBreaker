package com.diplomado.CircuitBreaker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diplomado.CircuitBreaker.manager.IEmailManager;

@Service
public class EmailService implements IEmailService {

    private IEmailManager EmailManager;

    @Autowired
    public EmailService(IEmailManager EmailManager) {
        this.EmailManager = EmailManager;
    }

    @Override
    public String processEmail() throws Exception{
        return EmailManager.processEmail();
    }
}
