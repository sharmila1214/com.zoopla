package com.org.runner;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"features"}, 
glue = {"com.org.stepdefinition"},
//format = { "pretty", "html:test_output","junit:junit_report.cucumber.xml", "json:json.cucumber.json" },
format= {"pretty","html:target/cucumber","json:target/cucumber-report.json"},
monochrome = true,
	dryRun = false)


public class Runner extends AbstractTestNGCucumberTests{
	private static final int PORT = 8080;
	private static final String HOST = "localhost";
	private WireMockServer wireMockServer = new WireMockServer(PORT);
	
	
	
	@BeforeTest
	void configureSystemUnderTest() throws InterruptedException, IOException {
		wireMockServer.start();
		ResponseDefinitionBuilder mockResponse = new ResponseDefinitionBuilder();
		mockResponse.withStatus(200).withBodyFile("student.json")
		.withHeader("Content-Type", "application/json");
		WireMock.configureFor(HOST, PORT); 
		WireMock
		.stubFor(WireMock.get("/student/webapi/api/all")
				.willReturn(mockResponse));
	
		
	
	
	
	
	};
		
	@AfterTest
	public void teardown() throws InterruptedException, IOException {
		
		this.wireMockServer.stop();
		
		

	}	

}

