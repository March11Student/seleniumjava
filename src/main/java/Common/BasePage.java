package Common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class BasePage {
    public static WebDriver driver;

    public static  String url = "https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";

    public static WebDriver initDriver() {
        driver = WebDriverManager.chromedriver().create();

        return driver;
    }

    public static void destroyDriver() {
        driver.quit();
    }

    public static void launchHomePage() {
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().getPageLoadTimeout();
        System.out.println("Home Page Opened");
    }

    public static void pause(int sec) {
        try {
            Thread.sleep(1000*sec);
        } catch (InterruptedException e) {

        }
    }


}
