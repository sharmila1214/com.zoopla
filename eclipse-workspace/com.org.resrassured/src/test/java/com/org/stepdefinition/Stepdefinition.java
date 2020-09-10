package com.org.stepdefinition;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import  com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.org.testbase.Testbase;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Stepdefinition extends Testbase{
	
	private Response response;
	private ValidatableResponse json;

	public  static ExtentReports reports;
	public static  ExtentTest logger;
	public WireMockServer wireMockserver;
	@Before
	public void setup() throws IOException {
		System.out.println("inside setup");
		
		Testbase.extentRep();
		
					
		}
	

		
	public RequestSpecification request;
	@Given("^I set GET student service api$")
	public void i_set_GET_student_service_api() throws Throwable {
		Testbase.logger=Testbase.reports.startTest("testcase1");
		RestAssured.baseURI ="http://localhost:8080/student/webapi/api/all";
		
        Testbase.logger.log(LogStatus.PASS, "STUDENT serivce api up and running");
	
	}
	
	@Given("^I set GET user service api  \"([^\"]*)\"$")
	public void i_set_GET_user_service_api(String URL) throws Throwable {
		
		Testbase.logger=Testbase.reports.startTest("testcase2");
		RestAssured.baseURI =URL;
		 Testbase.logger.log(LogStatus.PASS, "USER api successfully running ");
	
}
	@When("^I set request HEADER$")
	public void i_set_request_HEADER() throws Throwable {
		request = 	given()
				.contentType(ContentType.JSON);   
		 Testbase.logger.log(LogStatus.PASS, "passing Headers");

	}

	@When("^Send GET HTTP request$")
	public void send_GET_HTTP_request() throws Throwable {
		response=request.when().get();
		   System.out.println(response.asString());
		  Testbase. logger.log(LogStatus.INFO, "GET THE RESPONSE");
		   //System.out.println("response: " + response.prettyPrint());    
	}

	@Then("^I receive valid HTTP Response code (\\d+)$")
	public void i_receive_valid_HTTP_Response_code(int statuscode) throws Throwable {
		json = response.then().statusCode(statuscode);    
		
		Testbase.logger.log(LogStatus.INFO, "GET RESPONSE SUCCESS");
	}

	@Then("^perform the request based on queries$")
	public void perform_the_request_based_on_queries() throws Throwable {
		System.out.println("printing the value of username "+response.jsonPath().getString("username"));
		System.out.println("printing all session ids"+response.jsonPath().getString("sessionid"));
		
		System.out.println("printing last value of session id"+response.jsonPath().getString("sessionid[3]"));
		System.out.println("printing all marks of second student"+response.jsonPath().getString("students[1].marks"));
		//Hashmap<String,String> studentaddress
		System.out.println("printing first  student second city"+response.jsonPath().getString("students[0].adresss.state[1]"));
		System.out.println("printing all cities of second student "+response.jsonPath().getString("students[1].adresss.city"));
		System.out.println("printing second contact value of second student"+response.jsonPath().getString("students[1].contact[1]"));
		System.out.println("printing contacts of all students"+response.jsonPath().getString("students.contact"));
		System.out.println("printing address of first student"+response.jsonPath().getString("students[0].adresss"));       
		Testbase.logger.log(LogStatus.INFO, "ALL QUERIES GOT RESPONSE");
	
	}

	@Then("^get the titles if userid equalto (\\d+)$")
	public void get_the_titles_if_userid_equalto(int arg1) throws Throwable {
		List<HashMap<String,String>> userlist=response.jsonPath().getList("$");
		for(int i=0;i<userlist.size();i++) {
			
				String userid=String.valueOf(userlist.get(i).get("userId"));
				if(userid.equals("7"))
				System.out.println("titles are   "+userlist.get(i).get("title"));
				
		
		}       
		Testbase.logger.log(LogStatus.PASS, "Successfully get the titles");	
	}

@After
public void reports() {
	Testbase.reports.endTest(logger);
	Testbase.reports.flush();
	
}

}
