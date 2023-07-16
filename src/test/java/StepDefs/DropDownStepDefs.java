package StepDefs;

import Pages.DropDownPage;
import io.cucumber.java.en.Then;

public class DropDownStepDefs {

    DropDownPage dd ;
    public DropDownStepDefs() {
        dd = new DropDownPage();
    }

    @Then("^I am able to verify single select dropdown$")
    public void verifySingleDD() {
        dd.selectSingleValueDropDown("Apple");
        System.out.println("yahoo selected");
        dd.selectMultiValueDropDown();

    }
}
