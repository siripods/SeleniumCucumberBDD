package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeaturewithTags",
glue={"StepDefinitions"},
tags= {"@regression and not @smoke"})
public class TestRunner_RunWithSingleTag {

}
