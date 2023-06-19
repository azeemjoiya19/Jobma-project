
package com.qa.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@test1", features = { "src/test/resources/Features/SetupInterview.feature" }, glue = {
		"com.qa.steps" }, monochrome = true, plugin = { "pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", }

)

public class TestRunner {

}
