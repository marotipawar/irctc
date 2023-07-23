package com.maroti.page;

import com.maroti.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.net.URISyntaxException;

public class LoginElements extends BaseClass {
    protected WebDriver driver;
    @FindBy(xpath = "//div[@class='col-sm-12 h_container']/div[2]/div/a[1]")
    protected WebElement loginLink;

    @FindBy(xpath = "//input[@id='7991592']")
    protected WebElement username;
    @FindBy(xpath = "//input[@id='3991352']")
    protected WebElement password;

    @FindBy(xpath = "//button[@type='submit']/parent::span")
    protected WebElement loginBtn;

    LoginElements() throws URISyntaxException, IOException {
        this.driver=initialize();
        PageFactory.initElements(driver, this);
    }
}
