package com.example.codeclan.bookingservice;

import com.example.codeclan.bookingservice.models.Booking;
import com.example.codeclan.bookingservice.models.Customer;
import com.example.codeclan.bookingservice.models.Table;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingserviceApplicationTests {

    Table table1;
    Booking booking1;




	@Test
	public void contextLoads() {
	}

    @Before
    public void setUp() throws Exception {

        LocalDateTime startTime1 = LocalDateTime.of(2018,9,9,16,30);
        Customer customer1 = new Customer("Bob", 30, "071234");
        Table table1 = new Table(1, 1);
        Booking booking1 = new Booking(customer1, 1, startTime1, table1 );
    }



    @Test
    public void canAddBooking() {
	    table1.addBooking(booking1);
	    assertEquals(true, table1.isReserved());
    }
}
