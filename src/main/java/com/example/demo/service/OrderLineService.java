package com.example.demo.service;

import com.example.demo.Dao.repo.OrderLineRepo;
import com.example.demo.entities.OrderLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderLineService {

    @Autowired
    OrderLineRepo orderLineRepo;


    public OrderLine addorderline(OrderLine orderLine) {

        return this .orderLineRepo.save( orderLine);

    }


















}
