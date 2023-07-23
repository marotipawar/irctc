package com.maroti.page;

import com.maroti.model.Search;
import com.maroti.page.elements.BookTicketPageElement;
import com.maroti.util.web.DropDown;

import java.text.SimpleDateFormat;

public class BookTicketPage extends BookTicketPageElement {
    public void searchTrain(Search search) throws InterruptedException {
        String[] date = search.getDate().split("/");
        waitVisibility(fromCity).sendKeys(search.getFrom());
        Thread.sleep(4000);
        waitVisibility(selectFromCity).click();
        Thread.sleep(4000);

        waitVisibility(clickDate).click();
        String month = waitVisibility(selectMonth).getText();
        String year = waitVisibility(selectYear).getText();
        while (true) {
            if (month.equals(date[2]) && year.equals(date[3])) {
                break;
            } else {
                waitVisibility(nextMonth).click();
            }
        }
        Thread.sleep(4000);
        DropDown.handle(waitVisibilityList(selectDay), date[0]);
        Thread.sleep(4000);
        waitVisibility(toCity).sendKeys(search.getTo());
        Thread.sleep(4000);
        waitVisibility(selectToCity).click();
        waitVisibility(clickCoach).click();
        DropDown.handle(waitVisibilityList(listOfCoach), search.getCoach());
        waitVisibility(searchTrain).click();
    }
}
