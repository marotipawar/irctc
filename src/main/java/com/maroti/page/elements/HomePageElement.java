package com.maroti.page.elements;

import com.maroti.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElement extends BaseClass {

    @FindBy(xpath = "//span[@class='ng-star-inserted']")
    protected WebElement loggedUser;

    public HomePageElement(){
        PageFactory.initElements(driver, this);
    }

}
