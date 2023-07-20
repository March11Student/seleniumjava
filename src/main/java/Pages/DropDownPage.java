package Pages;

import Common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownPage extends BasePage {

    public static String dropDownXpath = "//select[@class='col-lg-3' and @id='first']";

    public void selectSingleValueDropDown(String value) {
        pause(5);
        WebElement element = driver.findElement(By.xpath(dropDownXpath));
        Select sel = new Select(element);
        sel.selectByValue(value);
        pause(2);
        sel.selectByIndex(1);
        pause(2);
        sel.selectByVisibleText("Bing");
        takeScreeShot();
    }

    public void selectMultiValueDropDown() {
        WebElement multiDrop = driver.findElement(By.xpath("//select[@id='option-droup-demo']"));

        Select sel =  new Select(multiDrop);

        boolean flag = sel.isMultiple();

        List<WebElement> allOptions = sel.getOptions();
        for (int i =0; i < allOptions.size(); i++) {
            System.out.println(allOptions.get(i).getText());
        }
        System.out.println(flag);
        sel.selectByValue("jQuery");
        pause(2);
        sel.selectByIndex(3);
        pause(2);
        sel.selectByVisibleText("Angular");
        pause(2);

    }






    }
