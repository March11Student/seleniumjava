package StepDefs;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class HomePageStepDefs {

    HomePage hp ;
    public HomePageStepDefs() {
        hp = new HomePage();
    }

    @Given("^I navigate to homepage$")
    public void openHomePage() {
        hp.navigatePage();

    }

    @And("I am able to close browser")
    public void closeBrowser() {
        hp.closeBrowser();
    }
}
