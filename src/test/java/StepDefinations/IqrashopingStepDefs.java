package StepDefinations;

import cucumber.api.java.en.*;


public class IqrashopingStepDefs {
    @Given("^I launch the chrome browser$")
    public void i_launch_the_chrome_browser() throws Throwable {
        System.out.println("I launch the chrome browser" );

    }

    @Given("^I click on Myaccount page$")
    public void i_click_on_Myaccount_page() throws Throwable {
        System.out.println("^I click on Myaccount page$" );

    }

    @Given("^I enter user name and password$")
    public void i_enter_user_name_and_password() throws Throwable {
        System.out.println("^I enter user name and password$" );
    }

    @Given("^I click on the Login button$")
    public void i_click_on_the_Login_button() throws Throwable {
        System.out.println("^I click on the Login button$" );
    }

    @Then("^I should landed to the myacoount dashboard$")
    public void i_should_landed_to_the_myacoount_dashboard() throws Throwable {
        System.out.println("^I should landed to the myacoount dashboard$" );
    }

}
