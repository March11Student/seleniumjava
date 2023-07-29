package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //path of feature file
        features = "C:\\workspace\\seleniumjava\\src\\test\\java\\Features\\TestDropDown.feature",
        //path of step de file
        glue = {"StepDefs"}
)
public class TestRunner {

}