package stepdef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features/TagFeature", // Make sure this matches your feature folder name
    glue = {"stepdef"},                  // Points directly to your package
    plugin = {"json:target/cucumber.json"},
    tags = "@Regrssion or @smoke"
)
public class Testrun {

}
