package com.maroti.page;

import com.maroti.model.Search;
import com.maroti.page.elements.BookTicketPageElement;
import com.maroti.util.web.DropDown;
import com.maroti.util.web.JavaScriptExecutor;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;

public class BookTicketPage extends BookTicketPageElement {
    public void searchTrain(Search search) throws InterruptedException {
        String[] date = search.getDate().split("/");
        Thread.sleep(4000);
        waitVisibility(fromCity).click();
        waitVisibility(fromCity).sendKeys(search.getFrom());
        waitVisibility(selectFromCity).click();

        waitVisibility(toCity).click();
        waitVisibility(toCity).sendKeys(search.getTo());
        waitVisibility(selectToCity).click();
        clickDate.click();

       // String year = waitVisibility(selectYear).getText();
        while (true) {
            String month = waitVisibility(selectMonth).getText();
            if (month.equals(date[1])) {
             /* for(WebElement wb :selectDay){
                  if(wb.getText().equals(date[0])){
                      System.out.println("Result Match :### "+wb.getText());
                      wb.click();
                      break;
                  }
              }*/
                 DropDown.handle(waitVisibilityList(selectDay), date[0]);
                break;
            } else {
                waitVisibility(nextMonth).click();
            }
        }
        Thread.sleep(2000);
        waitVisibility(clickCoach).click();
        DropDown.handle(waitVisibilityList(listOfCoach), search.getCoach());
        waitVisibility(searchTrain).click();
    }
}
