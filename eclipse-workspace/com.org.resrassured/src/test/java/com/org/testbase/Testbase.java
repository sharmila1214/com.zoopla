package com.org.testbase;

import java.io.IOException;
import java.text.SimpleDateFormat;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import java.util.Date;

public class Testbase {
	public static ExtentReports reports;
	public static ExtentTest logger;
	public static   void extentRep() throws IOException {
		
		//extent report
				String filename = new SimpleDateFormat("'redfin_'yyyyMMddHHmmSS'.html'").format(new Date());
				String path = System.getProperty("user.dir") + ("\\src\\main\\java\\com\\org\\extentreports\\") + filename;
				reports = new ExtentReports(path);

	}

}
