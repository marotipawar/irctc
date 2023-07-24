package com.maroti.page.elements;

import com.maroti.base.BaseClass;
import com.maroti.model.Search;
import com.maroti.util.web.DropDown;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;
import java.util.List;

public class BookTicketPageElement extends BaseClass {
    @FindBy(xpath = "//p-autocomplete[@id='origin']//input")
    protected WebElement clickFromCity;
    @FindBy(xpath = "//p-autocomplete[@id='origin']//input")
    protected WebElement fromCity;

    @FindBy(xpath = "(//ul[@role='listbox']/li/span)[1]")
    protected WebElement selectFromCity;
    @FindBy(xpath = "//p-autocomplete[@id='destination']//input")
    protected WebElement clickToCity;
    @FindBy(xpath = "//p-autocomplete[@id='destination']//input")
    protected WebElement toCity;
    @FindBy(xpath = "(//ul[@role='listbox']/li/span)[1]")
    protected WebElement selectToCity;

    @FindBy(xpath = "//p-calendar/span/input")
    protected WebElement clickDate;

    @FindBy(xpath = "(//p-calendar/span//div)[3]/div/span[1]")
    protected WebElement selectMonth;
    @FindBy(xpath = "(//p-calendar/span//div)[3]/div/span[2]")
    protected WebElement selectYear;

    @FindBy(xpath = "//p-calendar//td/a")
    protected List<WebElement> selectDay;

    @FindBy(xpath = "(//p-dropdown)[1]")
    protected WebElement clickCoach;
    @FindBy(xpath = "(//p-dropdown)[1]/div/div[4]/div/ul//span")
    protected List<WebElement> listOfCoach;

    @FindBy(xpath = "//button[@type='submit']")
    protected WebElement searchTrain;

    @FindBy(xpath = "//p-calendar//a[2]")
    protected WebElement nextMonth;

    public BookTicketPageElement() {
        PageFactory.initElements(driver, this);
    }


}
