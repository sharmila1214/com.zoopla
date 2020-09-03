package com.org.stepdefinition;



import org.testng.Assert;

import com.org.base.Testbase;
import com.org.pages.Homepage;
import com.org.pages.Realestateagentpage;
import com.org.utilities.Reusablefunctions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends Testbase {
	
	Reusablefunctions functions=new Reusablefunctions();
	Homepage homepage;
	Realestateagentpage realestatePage;
	  
	@Given("^Zoopla application launched$")
	public void zoopla_application_launched() throws Throwable {
		Testbase.logger=Testbase.reports.startTest("testcase");   
	}

	@When("^verify the homepage using homepage title\"([^\"]*)\"$")
	public void verify_the_homepage_using_homepage_title(String homepageTitle) throws Throwable {
		homepage=new Homepage();
		String ActualTitle = homepage.validateHomePage();
		Boolean result = functions.verify_Text(ActualTitle, homepageTitle, "Home Page");
		Assert.assertTrue(result);    
	}

	@Then("^enter the \"([^\"]*)\" in searchbox and press the enter button$")
	public void enter_the_in_searchbox_and_press_the_enter_button(String cityname) throws Throwable {
	 homepage.enterTextSearchBox(cityname);   
	}

	@Then("^printing price values in decending order$")
	public void printing_price_values_in_decending_order() throws Throwable {
	   homepage.sortingthehouseepricelist();
	}

	@Then("^Click on fifth th property from the list$")
	public void click_on_fifth_th_property_from_the_list() throws Throwable {
	  realestatePage=  homepage.selectpropertyfromlist();
	}

	@When("^click on agentname on the same page$")
	public void click_on_agentname_on_the_same_page() throws Throwable {
	    realestatePage.selectingagentname();
	}

	@Then("^Validate agents page with agent pageheader$")
	public void validate_agents_page_with_agent_pageheader() throws Throwable {
	   
	    realestatePage.validateagentpageheader();
	}

	@Then("^check the properties having agent name$")
	public void check_the_properties_having_agent_name() throws Throwable {
		realestatePage.validatesearchresult();
	}


}
