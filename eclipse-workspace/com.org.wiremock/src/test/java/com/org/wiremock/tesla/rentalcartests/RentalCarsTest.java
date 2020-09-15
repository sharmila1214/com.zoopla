package com.org.wiremock.tesla.rentalcartests;


import org.testng.annotations.Test;
import org.apache.log4j.Logger;

import com.org.wiremock.tesla.stubmappings.StubmappingsForRentalCars;
import static org.hamcrest.MatcherAssert.assertThat;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.comparesEqualTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
//import org.apache.log4j.Logger;


public class RentalCarsTest extends StubmappingsForRentalCars{

	public  Logger log=Logger.getLogger(getClass().getSimpleName());

@Test(priority=1)
public void getRequest_Returns_ListOf_AllCars() throws    Exception        {
	    
	String sHostName="http://localhost:8088";
	String URI="/getcars";
	String URL=sHostName+URI;
	RestAssured.baseURI=URL;
	Response response=RestAssured.given().contentType("application/json").get();
	System.out.println(response.asString());
	log.info("Get the response body after parsing as string:"+response.asString());
	System.out.println(response.statusCode());
	log.info("get the status code of response"+response.statusCode());
	String responsebody=response.getBody().asString();
	System.out.println(responsebody);
	log.info("Get the response body:"+responsebody);
	assertThat(responsebody,containsString("Tesla"));
	
}

@Test(priority=2)
public void getRequest_Returns_TeslaCarsWith_BlueColor_And_Notes() {
	   
	
	String sHostName="http://localhost:8088";
	String URI="/getcars";
	String URL=sHostName+URI;
	RestAssured.baseURI=URL;
	
	String make="Tesla";
	String color="Blue";
	Response response=RestAssured.given().contentType("application/json").get();
	System.out.println(response.statusCode());
	log.info("Get the status code of response:"+response.statusCode());
	String responsebody=response.getBody().asString();
	List<String> limake=response.jsonPath().getList("Car.make");
	System.out.println(limake);
	log.info("Returns the list of all cars:"+limake);
	int setIndex=0;
	for(int i=0;i<limake.size();i++) {
		if(limake.get(i).equalsIgnoreCase(make)) {
			
		setIndex=i;
		String carcolor=response.jsonPath().getString("Car["+setIndex+"].metadata.Color")	;
		if(carcolor.equalsIgnoreCase(color)) {
			System.out.println("printing the car make that equals"+limake.get(i));
			log.info("printing the car make that equals: "+limake.get(i));
			
			System.out.println("printing only"  +make+   "of color:"+carcolor);
			log.info("printing only " +make+ "of color :"+carcolor);
			
			assertThat(carcolor,containsString("Blue"));
			 
			String carnotes =response.jsonPath().getString("Car["+setIndex+"].metadata.Notes");
			 System.out.println("Printing only notes of "+carcolor +make+" :"+carnotes);
		log.info("printing only notes of "+carcolor +make +" :"+carnotes);			
		}
		}
	}
}		
	
	@Test(priority=3,enabled=false)
	public void getRequest_Returns_CarsWith_Lowest_PerDayRent() {
			
		String sHostName="http://localhost:8088";
		String URI="/getcars";
		String URL=sHostName+URI;
		RestAssured.baseURI=URL;
		
		Response response=RestAssured.given().contentType("application/json").get();
		System.out.println(response.statusCode());
		log.info("Get the status code of response:"+response.statusCode());
		String responsebody=response.getBody().asString();
		List<Float> liperdayrent=response.jsonPath().getList("Car.perdayrent");
		System.out.println("print perdayrental cost of all cars :"+liperdayrent);
		log.info("print perdayrental cost of all cars :"+liperdayrent);
		ArrayList<Float> alperdayrent=new ArrayList<>();
		ArrayList<Float> alperdayrentplusdiscount =new ArrayList<>();
		int setIndex=0;
		for(int i=0;i<liperdayrent.size();i++) {
			  
			Float perDayRentPrice=response.jsonPath().getFloat("Car["+i+"].perdayrent.Price");
			Float perDayRentDiscount=response.jsonPath().getFloat("Car["+i+"].perdayrent.Discount");
			Float perDayRentandDiscount=(perDayRentPrice- (perDayRentPrice * perDayRentDiscount/100));
			alperdayrent.add(perDayRentPrice);
			alperdayrentplusdiscount.add(perDayRentandDiscount);
		}
		Collections.sort(alperdayrent);
		System.out.println("Returns all cars starting from lowest perdayrent with price only:"+alperdayrent);
		log.info("Returns all cars starting from lowest perdayrent with price only:"+ alperdayrent);
		Collections.sort(alperdayrentplusdiscount);
		System.out.println("Returns all cars starting from lowest perdayrent with price after discount"+alperdayrentplusdiscount);
	}
			
		
	@Test(priority=4)
	public void getRequest_Returns_CarsOf_Lowest_PerDayRent_WithPriceAnd_WithPriceAfterDiscount() {
			
		String sHostName="http://localhost:8088";
		String URI="/getcars";
		String URL=sHostName+URI;
		RestAssured.baseURI=URL;
		
		Response response=RestAssured.given().contentType("application/json").get();
		System.out.println(response.statusCode());
		log.info("Get the status code of response:"+response.statusCode());
		String responsebody=response.getBody().asString();
		List<Float> liperdayrent=response.jsonPath().getList("Car.perdayrent");
		System.out.println("print perdayrental cost of all cars :"+liperdayrent);
		log.info("print perdayrental cost of all cars :"+liperdayrent);
		ArrayList<PerdayRentPrice> alperdayrent=new ArrayList<>();
		ArrayList<PerDayRentandDiscount> alperdayrentplusdiscount =new ArrayList<>();
		int setIndex=0;
		for(int i=0;i<liperdayrent.size();i++) {
			   
			String vinumber=response.jsonPath().getString("Car["+i+"].vin");
			Float perDayRentPrice=response.jsonPath().getFloat("Car["+i+"].perdayrent.Price");
			Float perDayRentDiscount=response.jsonPath().getFloat("Car["+i+"].perdayrent.Discount");
			Float perDayRentandDiscount=(perDayRentPrice- (perDayRentPrice * perDayRentDiscount/100));
			alperdayrent.add(new PerdayRentPrice(vinumber,perDayRentPrice));
			alperdayrentplusdiscount.add(new PerDayRentandDiscount(vinumber,perDayRentandDiscount));
		}
		Collections.sort(alperdayrent);
		Collections.sort(alperdayrentplusdiscount);
		System.out.println("Returns all cars starting from lowest perdayrent with price only:");
		log.info("Returns all cars starting from lowest perdayrent with price only:");
		Iterator<PerdayRentPrice> it=alperdayrent.iterator();
		while(it.hasNext()) {
			System.out.println("-------------------------");
			
			PerdayRentPrice object=(PerdayRentPrice) it.next();
			System.out.println("Vin :"+object.sVin+"-----------------> Price :"+object.fPrice);
			log.info("Vin : "+object.sVin+"----------------> Price :"+object.fPrice);
		}		
	
	System.out.println("Returns all cars starting from lowest perdayrent with price after discount: ");
	
	log.info("Returns all cars starting from lowest paydayrent with price after discount :");
	
	Iterator<PerDayRentandDiscount> it1=alperdayrentplusdiscount.iterator();
	while(it1.hasNext()) {
	
	System.out.println("*********************");
	PerDayRentandDiscount object=(PerDayRentandDiscount) it1.next();
	System.out.println("Vin:  "+object.sVin+"-------------> PriceAfterDiscount: "+object.fpriceafterdiscount);
	
	log.info("Vin: "+object.sVin+"-------------------> PriceAfterDiscount: "+object.fpriceafterdiscount);
	}
	
	assertThat(Float.valueOf((float) 110.00), comparesEqualTo(alperdayrent.get(0).fPrice));
	assertThat(Float.valueOf((float) 93.5),comparesEqualTo(alperdayrentplusdiscount.get(0).fpriceafterdiscount));
	}
	
	
	
@Test(priority=6)	
public void getRequest_Returns_CarsWith_HighestRevenue_ForFullYear() {
	
	String sHostName="http://localhost:8088";
	String URI="/getcars";
	String URL=sHostName+URI;
	RestAssured.baseURI=URL;
	
	Response response=RestAssured.given().contentType("application/json").get();
	System.out.println(response.statusCode());
	log.info("Get the status code of response:"+response.statusCode());
	String responsebody=response.getBody().asString();
	List<Float> limake=response.jsonPath().getList("Car.make");
ArrayList<CarRevenue> highestRevenue =new ArrayList<>();
int setIndex=0;
List<Float> licarmetrics =response.jsonPath().getList("Car.metrics");

System.out.println(licarmetrics);
log.info("Returns each car with year to year maintainacecost plus depreciation:"+licarmetrics);

for(int i=0;i<licarmetrics.size();i++) {
	
String vinumber=response.jsonPath().getString("Car["+i+"].vin");

Float yoymaintenancecost=response.jsonPath().getFloat("Car["+i+"].metrics.yoymaintenancecost");

Float depreciation =response.jsonPath().getFloat("Car["+i+"].metrics.depreciation");
int yeartodate=response.jsonPath().getInt("Car["+i+"].metrics.rentalcount.yeartodate");

Float perDayRentPrice=response.jsonPath().getFloat("Car["+i+"].perdayrent.Price");
Float perDayRentDiscount=response.jsonPath().getFloat("Car["+i+"].perdayrent.Discount");
Float perDayRentandDiscount=(perDayRentPrice- (perDayRentPrice * perDayRentDiscount/100));
 
Float CarRevenue=((yeartodate*perDayRentandDiscount)-(yoymaintenancecost+depreciation));

highestRevenue.add(new CarRevenue(vinumber,CarRevenue));

}
Collections.sort(highestRevenue,Collections.reverseOrder());
System.out.println("Highest Revenue: ");
log.info("Highest Revenue");
Iterator<CarRevenue> it=highestRevenue.iterator();
while(it.hasNext()) {
	System.out.println("**********************");
	CarRevenue object=(CarRevenue) it.next();
	System.out.println("Vin: "+object.sVin+"--------------------->CarREvenue:  "+object.fCarRevenue);
	log.info("Vin: "+object.sVin+"--------------------->CarREvenue:  "+object.fCarRevenue);
	
}
assertThat(Float.valueOf((float) 37744.56),comparesEqualTo (highestRevenue.get(0).fCarRevenue));
}
































}
			
	
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			




































