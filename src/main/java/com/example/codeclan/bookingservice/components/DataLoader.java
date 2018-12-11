package com.example.codeclan.bookingservice.components;

import com.example.codeclan.bookingservice.models.Booking;
import com.example.codeclan.bookingservice.models.Customer;
import com.example.codeclan.bookingservice.models.Table;
import com.example.codeclan.bookingservice.repositories.bookingrepository.BookingRepository;
import com.example.codeclan.bookingservice.repositories.customerrepository.CustomerRepository;
import com.example.codeclan.bookingservice.repositories.tablerepository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


import java.time.LocalDateTime;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    TableRepository tableRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){

        LocalDateTime startTime1 = LocalDateTime.of(2018,9,9,16,30);
        LocalDateTime startTime2 = LocalDateTime.of(2018,11,14,16,30);



        Customer customer1 = new Customer("Bob", 30, "071234");
        customerRepository.save(customer1);
        Customer customer2 = new Customer("Joe", 19, "078465");
        customerRepository.save(customer2);


        Table table1 = new Table(1, 2);
        tableRepository.save(table1);
        Table table2 = new Table(2, 2);
        tableRepository.save(table2);


        Booking booking1 = new Booking(customer1, 2, startTime1, table1 );
        bookingRepository.save(booking1);
        Booking booking2 = new Booking(customer2, 4, startTime2, table2 );
        bookingRepository.save(booking2);


    }
}
