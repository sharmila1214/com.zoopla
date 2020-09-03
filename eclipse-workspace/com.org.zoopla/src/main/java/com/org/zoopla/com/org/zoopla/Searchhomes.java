package com.org.zoopla.com.org.zoopla;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Searchhomes {
	WebDriver driver;
	  @BeforeSuite
	  public void launchbrowser() {
		  WebDriverManager.chromedriver().setup();
//		  WebDriverManager.firefoxdriver().setup();
		  driver =new ChromeDriver();
		  driver.get("https://www.zoopla.co.uk/");
		  	
		  driver.manage().window().maximize();  
	  }
	 @Test
	 
	 public void search_homesinuk() throws InterruptedException {
		
	WebDriverWait wait=new WebDriverWait(driver,10)	 ;
	
driver.findElement(By.xpath("//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("search-input-location-placeholder-1")));

	 
WebElement ele = driver.findElement(By.xpath("//input[@id='search-input-location']"));
ele.sendKeys("london");
driver.findElement(By.xpath("//button[@id='search-submit']")).click();
//a[@class='listing-results-price text-price']
List<WebElement> pricelist= driver.findElements(By.xpath("//ul[@class='listing-results clearfix js-gtm-list']//a[@class='listing-results-price text-price']"));
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
	 System.out.println("the 5 the element from the list"+pricerange.get(4));
	
	//ul[@class='listing-results clearfix js-gtm-list']//a[2]
	 
	 List<WebElement> ls=driver.findElements(By.xpath("//ul[@class='listing-results clearfix js-gtm-list']//a[@class='listing-results-price text-price']"));
		
	 System.out.println("the size of the list"+ls.size());
	 
	 JavascriptExecutor je = (JavascriptExecutor) driver;
	 
	je.executeScript("arguments[0].click();", ls.get(4));
	System.out.println(driver.getTitle());
		
WebElement agentname=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class='ui-agent__name']")));
String actualname=agentname.getText();	
System.out.println(agentname.getText());

agentname.click();
WebElement pageheader=driver.findElement(By.className("bottom-half"));
System.out.println(pageheader.getText());
		 
		
		
			
		
	 
	// driver.navigate().to("https://www.zoopla.co.uk/for-sale/contact/55987761?action=Contact%20agent&label=%2Ffor-sale%2Fresults%2F&search_identifier=3fe53012dbf095a3ae5d7176092e7279&type=email");
	
	//String pagetitle=driver.getTitle();
	// System.out.println(pagetitle);
	// String expectedResult="Proctors Anerely";

List<WebElement> listOfHomes=driver.findElements(By.className("listing-results-address"));

			if (listOfHomes.size() == 0) {
				//logger.log(LogStatus.FAIL, "No data to test");
				System.out.println("no odata to test");
				//Assert.assertTrue(false, "no data to test");
			} else {
				boolean b = true;
				for (WebElement result : listOfHomes) {
					if (result.getAttribute("href").contains(actualname)) {
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
	  @AfterSuite
	  public void Teardown() {
	  driver.close();	
	  }
}
