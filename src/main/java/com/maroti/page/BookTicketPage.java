package com.maroti.page;

import com.maroti.model.Search;
import com.maroti.page.elements.BookTicketPageElement;
import com.maroti.util.web.DropDown;

import java.text.SimpleDateFormat;

public class BookTicketPage extends BookTicketPageElement {
    public void searchTrain(Search search) throws InterruptedException {
        String[] date = search.getDate().split("/");

        waitVisibility(fromCity).click();
        waitVisibility(fromCity).sendKeys(search.getFrom());
        waitVisibility(selectFromCity).click();

        waitVisibility(toCity).click();
        waitVisibility(toCity).sendKeys(search.getTo());
        waitVisibility(selectToCity).click();

        waitVisibility(clickDate).click();
        String month = waitVisibility(selectMonth).getText();
        String year = waitVisibility(selectYear).getText();
        while (true) {
            if (month.equals(date[1]) && year.equals(date[2])) {
                DropDown.handle(waitVisibilityList(selectDay), date[0]);
                break;
            } else {
                waitVisibility(nextMonth).click();
            }
        }

        waitVisibility(clickCoach).click();
        DropDown.handle(waitVisibilityList(listOfCoach), search.getCoach());
        waitVisibility(searchTrain).click();
    }
}
