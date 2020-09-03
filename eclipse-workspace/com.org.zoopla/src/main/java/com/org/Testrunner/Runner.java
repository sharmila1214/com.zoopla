package com.org.Testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/java/features/"}, 
glue = {"com.org.stepdefinition"},
format = { "pretty", "html:test_output","junit:junit_report.cucumber.xml", "json:json.cucumber.json" },
monochrome = true,
	dryRun = false)


public class Runner extends AbstractTestNGCucumberTests{

}
