package com.example.providertickets.service;

import org.springframework.stereotype.Service;

@Service
public class TicketService {
    public String getTicket(){
        System.out.println("8022");
        return "《我和我的祖国》";
    }
}
