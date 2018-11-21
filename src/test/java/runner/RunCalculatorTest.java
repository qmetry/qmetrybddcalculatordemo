package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", 
		plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber.json"}, 
		glue = {"stepdefs"}, 
		monochrome = false)

public class RunCalculatorTest {

}
