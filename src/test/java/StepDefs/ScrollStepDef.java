package StepDefs;

import Common.BasePage;
import io.cucumber.java.en.Then;

public class ScrollStepDef extends BasePage{

@Then("^I am able to verify scrolling$")
    public void verifyScroll(){
    scrollingByPixel();

}


}
