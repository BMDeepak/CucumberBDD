package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features", // Make sure this matches your feature folder name
    glue = {"StepDefinitions"},                  // Points directly to your package
    plugin = {"pretty", "html:target/cucumber-reports.html"}
//    tags = "smoke or Regrssion"
)
public class TestRunner {
}