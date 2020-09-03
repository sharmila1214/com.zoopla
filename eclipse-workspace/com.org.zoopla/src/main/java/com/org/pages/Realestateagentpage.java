package com.org.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.org.base.Testbase;
import com.org.utilities.Reusablefunctions;
import com.relevantcodes.extentreports.LogStatus;

public class Realestateagentpage extends Testbase{
	
	Reusablefunctions functions = new Reusablefunctions();	
	public Realestateagentpage() throws IOException {
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//h4[@class='ui-agent__name']")
WebElement clickagentname ;


@FindBy(xpath="//h1[@class='bottom-half']/b[1]")
WebElement agentpageheader;

@FindBy(className="listing-results-address")
WebElement  agentpagehouselist;


String expectedresult,actualname;
//validating RealEstate page
public String validateRealEstatePage() {
	System.out.println(driver.getTitle());
	return driver.getTitle();
}
//clicking on agentname
  public String selectingagentname() {
	  
	  String actualname=clickagentname.getText();	
	  System.out.println(clickagentname.getText());
	  
		
	clickagentname.click();
	
	logger.log(LogStatus.PASS,"agentname succefully clicked");
 return actualname;
  }
  

public void validateagentpageheader( ) {
	
String actualHeader=agentpageheader.getText();
System.out.println(driver.getTitle());
if(driver.getTitle().contains(actualHeader))
	System.out.println("success");
	logger.log(LogStatus.PASS,"agentname succefully clicked");

}
  
public void validatesearchresult() {
	
String name=agentpageheader.getText();
List<WebElement> listOfHomes=driver.findElements(By.className("listing-results-address"));

if (listOfHomes.size() == 0) {
	//logger.log(LogStatus.FAIL, "No data to test");
	System.out.println("no odata to test");
	//Assert.assertTrue(false, "no data to test");
} else {
	boolean b = true;
	for (WebElement result : listOfHomes) {
		if (result.getAttribute("href").contains(name)) {
			b = true;
		} else 
			b = false;
			break;
		}
	

	if (b) {
		System.out.println( "All results match to search item");
	} else {
		System.out.println( "All results do not match to search item");
	}	
}	

}
}










