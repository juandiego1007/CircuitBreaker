package com.diplomado.CircuitBreaker.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class EmailManager implements IEmailManager {


    private RestTemplate restTemplate;

    @Autowired
    public EmailManager(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String processEmail() throws Exception {
        try {
            restTemplate.getForEntity("https://www.google.com", String.class);
            return "Email enviado correctamente";
        } catch (Exception ex) {
            throw ex;
        }
    }
}
