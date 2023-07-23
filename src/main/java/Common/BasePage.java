package Common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BasePage {
    public static WebDriver driver;

    public static  String url = "https://www.hyrtutorials.com/p/window-handles-practice.html";

    public static void initDriver() {
        ChromeOptions co = new ChromeOptions();
        WebDriverManager.chromedriver().driverVersion("114.0.5735.198").setup();
        driver = new ChromeDriver(co);
    }

    public static void destroyDriver() {
        driver.quit();
    }

    public static void launchHomePage() {
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().getPageLoadTimeout();
        System.out.println("Home Page Opened");
        takeScreeShot();
    }

    public static void takeScreeShot() {
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
        Date date = new Date();

        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File("/Users/vishalu/Downloads/Class2023/seleniumjava/src/test/resources/ScreenShot/"
                + "capture-" + dateFormat.format(date) + ".png");
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void screenShotUsingEventFiring() {
        EventFiringWebDriver efw =  new EventFiringWebDriver(driver);
        File src = efw.getScreenshotAs(OutputType.FILE);
        File destFile =  new File("/Users/vishalu/Downloads/Class2023/seleniumjava/src/test/resources/ScreenShot/efw.png");
        try {
            FileUtils.copyFile(src, destFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void pause(int sec) {
        try {
            Thread.sleep(1000*sec);
        } catch (InterruptedException e) {

        }
    }

    public static void scrollingByPixel(){
        pause(5000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,3000)");

    }


}
