package StepDefinations;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\workspace\\seleniumjava\\src\\test\\resources\\Features\\iqrashopingDemo.feature"
        ,glue={"StepDefinations"}
)

public class TestRunner {

}
