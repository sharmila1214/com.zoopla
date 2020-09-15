package com.org.wiremock.utilities;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import   com.github.tomakehurst.wiremock.WireMockServer;
import   com.github.tomakehurst.wiremock.client.WireMock;

public class Testbase {
  
public static int iport=8088;	
	
public WireMockServer wireMockserver;	
public static String slog4jpath=System.getProperty("user.dir")+"\\src\\main\\resources\\properties\\log4j.properties";
public  Logger log= Logger.getLogger(Testbase.class);
//public  Logger log=Logger.getLogger(getClass().getSimpleName());
public static Commonutilities commonutil=new Commonutilities();
	
@BeforeSuite
public void setupWiremockServer() throws Exception {
    
	wireMockserver= new WireMockServer(iport);
	//WireMock wiremock1=new WireMock("localhost",9999);
	wireMockserver.start();
	commonutil.loadLog4jProperty(slog4jpath);
}


@AfterSuite
public void teardown() {
wireMockserver.stop();	
}
}