package com.org.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.base.Testbase;
import com.relevantcodes.extentreports.LogStatus;

public class Homepage  extends Testbase{
	 
	public Homepage() throws IOException {
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")	
WebElement popup;	
	
@FindBy(xpath="//input[@id='search-input-location']")	
WebElement searchbutton;
	
@FindBy(xpath="//button[@id='search-submit']")
WebElement submitbutton;
  

@FindBy(xpath="//ul[@class='listing-results clearfix js-gtm-list']//a[@class='listing-results-price text-price']")
List<WebElement> pricelist;
	
	
//   validating homepage
	 
	public String validateHomePage() {
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}
//	entering text in searchbox
	public void enterTextSearchBox(String text) throws InterruptedException
	{
		popup.click(); 
		searchbutton.sendKeys(text);
		submitbutton.click();
		logger.log(LogStatus.PASS, "Text entered in textbox and pressed enter");
	}
	
	public void sortingthehouseepricelist() {
		
		ArrayList<String> pricerange =new ArrayList<>();
		System.out.println(pricelist.size());
		for(int i=0;i<pricelist.size()-1;i++)
		{
			System.out.println( pricelist.get(i).getText());
			String homeprices=pricelist.get(i).getText();
		pricerange.add(homeprices);
		}

			Collections.sort(pricerange,Collections.reverseOrder()); 
			System.out.println("************************************");
			System.out.println("the list of the houses in decending order");
			 for(String str: pricerange)
				 System.out.println(str);
		logger.log(LogStatus.PASS, "prices are successfully sored in descending order");	 
	}
	
	
   public Realestateagentpage selectpropertyfromlist() throws IOException {
	
	
    System.out.println("the size of the list"+pricelist.size());
	 
	 JavascriptExecutor je = (JavascriptExecutor) driver;
	 
	je.executeScript("arguments[0].click();", pricelist.get(4));
	System.out.println(driver.getTitle());
	logger.log(LogStatus.PASS, "fifth property selected successfully");	
	return new Realestateagentpage();
	
}	
	}
