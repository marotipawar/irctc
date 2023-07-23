package com.maroti.page.elements;

import com.maroti.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.net.URISyntaxException;

public class LoginElements extends BaseClass {
    @FindBy(xpath = "//div[@class='col-sm-12 h_container']/div[2]/div/a[1]")
    protected WebElement loginLink;

    @FindBy(xpath = "//input[@formcontrolname='userid']")
    protected WebElement username;
    @FindBy(xpath = "//input[@formcontrolname='password']")
    protected WebElement password;

    @FindBy(xpath = "//button[@type='submit']/parent::span")
    protected WebElement loginBtn;

    protected LoginElements() throws URISyntaxException, IOException {
        initialize();
        PageFactory.initElements(driver, this);
    }

    public WebDriver getDriver(){
        return driver;
    }
}
