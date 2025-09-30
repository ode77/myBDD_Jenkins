package StepDefs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Features_Files",
        glue =   {"StepDefs","Hooks"},
        plugin = { "pretty", "html:target/cucumber.html",
                "json:target/cucumber/cucumber-report.json",
                "junit:target/cucumber.xml"},
        publish = true,
        tags = "@UKBA_Smoke")

public class TestRunner {
}
