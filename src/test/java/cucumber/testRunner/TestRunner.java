package cucumber.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = "src/test/resources",
//        glue = "cucumber/StepDefinitions",
//        tags = "@Test"
//)

/**
 * This is a new runner for jenkins reports
 */

@CucumberOptions(features = "src/test/resources", tags = "@Test",
        glue = {"cucumber/StepDefinitions"},
        plugin = {"json:target/cucumber/cucumber.json", "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"})

public class TestRunner {
}
