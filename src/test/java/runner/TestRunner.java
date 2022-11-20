package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/features/home.feature",
        glue= {"step_definitions"},
        dryRun=false,
        monochrome=true,
        plugin= {"pretty","html:target/cucumber-html-report.html","json:target/cucumber-json-report.json"}
)

public class TestRunner {
}
