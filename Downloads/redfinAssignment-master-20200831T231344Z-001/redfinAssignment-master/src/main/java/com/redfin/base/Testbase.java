package com.redfin.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.sun.jna.platform.win32.WinBase.SYSTEM_INFO;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	public static Properties prop;
	public static WebDriver driver;
	public static ExtentReports reports;
	public static ExtentTest logger;

	//initializing property and extent report
	public void propertyExtentSetup() throws IOException {
		//property file for global properties
		prop = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")
				+ ("\\src\\main\\java\\com\\redfin\\utilities\\globalEnvironment.properties"));
		prop.load(file);
		
		//extent report
		String filename = new SimpleDateFormat("'redfin_'yyyyMMddHHmmSS'.html'").format(new Date());
		String path = System.getProperty("user.dir") + ("\\src\\main\\java\\com\\redfin\\extentreports\\") + filename;
		reports = new ExtentReports(path);

	}

	//	driver setup
	public void initialization() {
		String browserName = prop.getProperty("browsername");

		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver",
					//(System.getProperty("user.dir")) + (prop.getProperty("chromepath")));
			driver = new ChromeDriver();
		} else if (prop.getProperty("browsername").equals("firefox")) {
			// initiate firefox webdriver.gecko.driver new FirefoxDriver
		} else {
			System.out.println("invalid browser name");
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

}
