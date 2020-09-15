package com.redfin.stepdefinitions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Parameters;

import com.redfin.base.Testbase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends Testbase {

	@Before
	
	public void setup() throws IOException {
		propertyExtentSetup();
		initialization();

	}


	@After
	public void reports(Scenario scenario) throws InterruptedException, IOException {
		Thread.sleep(3000);
		 if (scenario.isFailed()) {
		      // Take a screenshot
		      File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		      String filename=new SimpleDateFormat("'failed_'yyyyMMddHHmmSS'.png'").format(new Date());
			File DestFile=new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\redfin\\screenshots\\"+filename);
			FileUtils.copyFile(screenshot, DestFile);
				
		    }
		driver.close();
		reports.endTest(logger);
		reports.flush();
		

	}
	}


