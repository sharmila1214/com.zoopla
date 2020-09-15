package com.redfin.stepdefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterSuite;

import com.redfin.base.Testbase;
import com.redfin.pages.HomePage;
import com.redfin.pages.RealEstatePage;
import com.redfin.utilities.ReusableFunctions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Testbase {
	ReusableFunctions functions=new ReusableFunctions();
	HomePage homepage;
	RealEstatePage realestatePage;
	
	@Given("^the redfin application is launched for \"([^\"]*)\"$")
	public void the_redfin_application_is_launched_for(String testName) {
		Testbase.logger=Testbase.reports.startTest(testName);
	}

	@Then("^verify the home page using \"([^\"]*)\"$")
	public void verify_the_home_page_using(String homePageTitle) throws IOException {
		homepage=new HomePage();
		String ActualTitle = homepage.validateHomePage();
		Boolean result = functions.verify_Text(ActualTitle, homePageTitle, "HomePage");
		Assert.assertTrue(result);
	  
	}

	@When("^enter the \"([^\"]*)\" in searchbox and press the enter button$")
	public void enter_the_in_searchbox_and_press_the_enter_button(String cityName) throws InterruptedException {
	    homepage.enterTextSearchBox(cityName);	    
	}

	@Then("^validate pop up appears$")
	public void validate_pop_up_appears() throws InterruptedException {
		homepage.popupValidation();
		
	}

	@When("^On the pop up select the entry \"([^\"]*)\"$")
	public void on_the_pop_up_select_the_entry(String SelectionFromPopUp) throws IOException, InterruptedException {
		
		realestatePage=homepage.selectCityFromPopUp(SelectionFromPopUp);
	  
	}

	@Then("^verify the city Real Estate page using \"([^\"]*)\"$")
	public void verify_the_city_Real_Estate_page_using(String estatePageHeader) {
		
		realestatePage.validateEstatePageHeader(estatePageHeader);
	}

	@Then("^assert the Search box on the top left side has \"([^\"]*)\"$")
	public void assert_the_Search_box_on_the_top_left_side_has(String expectedCityTag) {
	    realestatePage.validateCityTag(expectedCityTag);
	}

	@When("^Select the min price as \"([^\"]*)\" and max price as \"([^\"]*)\"$")
	public void select_the_min_price_as_and_max_price_as(String MinPrice, String MaxPrice) throws InterruptedException {

		realestatePage.enterMinValue(MinPrice);
		realestatePage.enterMaxValue(MaxPrice);
	}

	@Then("^Verify all the homes listed are from \"([^\"]*)\", if no homes listed throw an errorMessage$")
	public void verify_all_the_homes_listed_are_from_if_no_homes_listed_throw_an_errorMessage(String expectedResult) {
	   
		realestatePage.validatesearchResult(expectedResult);
		
	}

//@AfterSuite
//public void teardown() {
	//driver.close();



}
