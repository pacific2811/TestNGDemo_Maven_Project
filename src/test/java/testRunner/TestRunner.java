package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/googleSearch.feature"
        ,glue = {"stepDefinations"}
        ,dryRun = true
        ,monochrome = true
        ,plugin = {"pretty","html:target/cucumberHtmlReports"}
//        ,tags = "@smoketest"

)

public class TestRunner {
}
