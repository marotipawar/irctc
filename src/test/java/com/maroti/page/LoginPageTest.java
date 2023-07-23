package com.maroti.page;

import com.maroti.util.file.PropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;

public class LoginPageTest {

    private String username;
    private String password;
    private WebDriver driver;
    private LoginPage login;
    private Properties props;

    @BeforeMethod
    public void setUp() throws URISyntaxException, IOException, NoSuchMethodException {
        login = new LoginPage();
        driver = login.getDriver();
        props = PropertiesFile.load("credential.properties");
        username = props.getProperty("username");
        password = props.getProperty("password");

    }

    @Test(priority = 1)
    public void testLogin() throws InterruptedException {
        login.login(username, password);
    }

}