package com.maroti.page;

import com.maroti.page.elements.LoginElements;

import java.io.IOException;
import java.net.URISyntaxException;

public class LoginPage extends LoginElements {

    public LoginPage() throws URISyntaxException, IOException {
        super();
    }

    public void login(String usern, String pass) throws InterruptedException {

        waitElementToBeClickable(loginLink).click();
        waitVisibility(username).sendKeys(usern);
        waitVisibility(password).sendKeys(pass);
        Thread.sleep(15000);
        waitVisibility(loginBtn).click();

    }

}
