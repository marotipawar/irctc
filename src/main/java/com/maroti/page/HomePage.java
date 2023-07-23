package com.maroti.page;

import com.maroti.page.elements.HomePageElement;

public class HomePage extends HomePageElement {

    public String loggedUserDetails(){
        return waitVisibility(loggedUser).getText();
    }
}
