package com.maroti.page;

import com.maroti.model.Search;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Date;


public class BookTicketPageTest {

    private BookTicketPage bookTicket;

    @BeforeMethod
    public void setUp() {
        bookTicket= new BookTicketPage();
    }

    @Test(priority = 3)
    public void testSearchTrain() throws InterruptedException {
        Search search=Search.builder()
                .from("ned")
                .to("pune")
                .date("25/July/2023")
                .coach("Sleeper")
                .build();
        bookTicket.searchTrain(search);

    }
}