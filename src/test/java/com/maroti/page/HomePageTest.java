package com.maroti.page;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HomePageTest {

    private HomePage homePage;
    @BeforeMethod
    public void setUp() {
        homePage=new HomePage();
    }

    @Test(priority = 2)
    public void testLoggedUserDetails() {
        String user=homePage.loggedUserDetails();

    }
}