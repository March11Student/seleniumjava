package StepDefinations;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/vishalu/Downloads/Class2023/seleniumjava/src/test/resources/Features"
        ,glue={"StepDefinations"}
)

public class TestRunner {

}
