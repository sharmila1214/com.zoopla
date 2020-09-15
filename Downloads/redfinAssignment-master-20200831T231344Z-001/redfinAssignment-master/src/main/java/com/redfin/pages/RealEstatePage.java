package com.redfin.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.redfin.base.Testbase;
import com.redfin.utilities.ReusableFunctions;
import com.relevantcodes.extentreports.LogStatus;

public class RealEstatePage extends Testbase {
	ReusableFunctions functions = new ReusableFunctions();

	@FindBy(xpath = "//div[@class='sidepaneHeader']/h1")
	WebElement estatePageHeader;

	@FindBy(className = "textContent")
	WebElement cityTag;

	@FindBy(xpath = "//span[contains(@class,'field select Select quickMinPrice withFlyout withOptions mounted selected clickable optional')]//span[contains(@class,'container')]")
	WebElement minimumValue;
	
	@FindBy(xpath = "//span[contains(@class,'field select Select quickMaxPrice withFlyout withOptions mounted selected clickable optional')]")
	WebElement maximumValue;

	@FindBy(xpath = "//div[@class='homecards']//a")
	List<WebElement> listOfHomes;

	public RealEstatePage() throws IOException {
		PageFactory.initElements(driver, this);
	}

//	validating RealEstate page
	public String validateRealEstatePage() {
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}

//	validating cityEstatePage
	public void validateEstatePageHeader(String expectedHeader) {
		String actualHeader = estatePageHeader.getText();
		System.out.println(actualHeader);
		Assert.assertTrue(functions.verify_Text(actualHeader, expectedHeader, "EstatePageHeader"));
	}

//	validating city name on left corner in search box
	public void validateCityTag(String expectedTag) {
		String actualTag = cityTag.getText();
		Assert.assertTrue(functions.verify_Text(actualTag, expectedTag, "city Tag"));
	}

//	entering minimum value
	public void enterMinValue(String Value) throws InterruptedException {
		
		 minimumValue.click();
		
		int index=Integer.parseInt(Value);		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("document.getElementsByClassName('option')["+index+"].click();" );
		logger.log(LogStatus.PASS, "minimum value entered");
	}

//	entering maximum value
	public void enterMaxValue(String Value) throws InterruptedException {

		
		 maximumValue.click();
		Thread.sleep(5000);
		int index=Integer.parseInt(Value);		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("document.getElementsByClassName('option')["+index+"].click();" );
		logger.log(LogStatus.PASS, "maximum value entered");
	}

//	validating search result
	public void validatesearchResult(String expectedResult) {
		System.out.println("size is "+listOfHomes.size());
		if (listOfHomes.size() == 0) {
			logger.log(LogStatus.FAIL, "No data to test");
			//System.out.println(listOfHomes.size());
			System.out.println("no odata to test");
			//Assert.assertTrue(false, "no data to test");
		} else {
			boolean b = true;
			for (WebElement result : listOfHomes) {
				if (result.getAttribute("href").contains(expectedResult)) {
					b = true;
				} else {
					b = false;
					break;
				}
			}

			if (b) {
				logger.log(LogStatus.INFO, "All results match to search item");
			} else {
				logger.log(LogStatus.INFO, "All results do not match to search item");
			}
		}

	}

}
