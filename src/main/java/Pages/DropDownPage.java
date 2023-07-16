package Pages;

import Common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage extends BasePage {

    public static String dropDownXpath = "//select[@class='col-lg-3' and @id='first']";

    public void selectSingleValueDropDown(String value) {
        pause(10);
        WebElement element = driver.findElement(By.xpath(dropDownXpath));
        Select sel = new Select(element);
        sel.selectByValue(value);
        pause(10);
    }




}
