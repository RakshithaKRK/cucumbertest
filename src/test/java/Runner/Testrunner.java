package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/cucumber.features", glue = "stepdefinitions", tags = "@smok", plugin = {
		"pretty", "html:target/HtmlReports/report.html" }, monochrome = true

)

public class Testrunner extends AbstractTestNGCucumberTests {

}
