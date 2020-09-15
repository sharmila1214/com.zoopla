package com.redfin.runner;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = {"src/test/resources/features/"}, 
glue = {"com.redfin.stepdefinitions"},
format = { "pretty", "html:test_output","junit:junit_report.cucumber.xml", "json:json.cucumber.json" },
monochrome = true,
	dryRun = false)
public class Testrunner extends AbstractTestNGCucumberTests {
}
