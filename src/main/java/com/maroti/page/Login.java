package com.maroti.page;

import java.io.IOException;
import java.net.URISyntaxException;

public class Login extends LoginElements{

    public Login() throws URISyntaxException, IOException {
        super();
    }

    public void login(String usern, String pass){

        waitElementToBeClickable(loginLink).click();
        waitVisibility(username).sendKeys(usern);
        waitVisibility(password).sendKeys(pass);
        waitVisibility(loginBtn).click();
    }

}
