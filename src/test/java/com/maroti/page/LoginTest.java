package com.maroti.page;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;

public class LoginTest {

    private String username;
    private String password;
    private WebDriver driver;
    private Login login;
    private Properties props;
    @BeforeMethod
    public void setUp() throws URISyntaxException, IOException {
        login= new Login();
    }

    @Test
    public void testLogin() {

    }

}