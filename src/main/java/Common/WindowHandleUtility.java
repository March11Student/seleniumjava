package Common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandleUtility extends BasePage {

    public static void main (String [] args) {

        initDriver();
        launchHomePage();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.id("newTabsWindowsBtn"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView();", ele);


        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println("Total Number of elements " + elements.size());

        for (int i =0; i< elements.size(); i++) {
            String value = elements.get(i).getText();
            System.out.println("Element Value "+ i + " " + value);

        }


        String parentID = driver.getWindowHandle();
        System.out.println("Parent ID : " + parentID);
        driver.findElement(By.id("newWindowBtn")).click();
        pause(5);
        Set<String> winHandles = driver.getWindowHandles();
//        //iterator
//        Iterator<String> itr = winHandles.iterator();
//        while (itr.hasNext()) {
//
//            String id = itr.next();
//
//        }


        for(String handle : winHandles) {

            if(!handle.equals(parentID)) {
                driver.switchTo().window(handle);
                driver.findElement(By.id("firstName")).sendKeys("Vishal");
                pause(2);

            }
            System.out.println("Window ID's: " + handle);
        }

        driver.switchTo().window(parentID);
        driver.findElement(By.id("name")).sendKeys("test");
        pause(5000);
        System.out.println("All values has been entered");

        destroyDriver();

    }





}
