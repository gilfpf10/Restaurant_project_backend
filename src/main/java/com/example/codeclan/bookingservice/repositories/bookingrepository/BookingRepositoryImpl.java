package com.example.codeclan.bookingservice.repositories.bookingrepository;


import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;


public class BookingRepositoryImpl implements BookingRepositoryCustom{
    @Autowired
    EntityManager entityManager;



}

