import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
        glue = {"StepDefs"},
        plugin = {"pretty",
                "json:target/Cucumber.json",
                "junit:target/Cucumber.xml",
                "html:target/Cucumber.html"},
        monochrome = true)

public class TestRunner {

}