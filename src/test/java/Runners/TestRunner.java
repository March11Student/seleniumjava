package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //path of feature file
        features ="/Users/vishalu/Downloads/Class2023/seleniumjava/src/test/java/Features",
        //path of step definition file
        glue = {"StepDefs"}
)
public class TestRunner {
}