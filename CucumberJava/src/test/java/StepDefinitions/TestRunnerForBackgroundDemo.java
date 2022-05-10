package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/BackgroundDemo/BackgroundDemo.feature",
glue={"StepsForBackground"},
monochrome=true,
plugin={"pretty", "html:target/HtmlReports", "json:target/JsonReports/report.json"})
public class TestRunnerForBackgroundDemo {

	
}
