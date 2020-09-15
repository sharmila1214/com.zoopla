package com.org.wiremock.tesla.stubmappings;

import org.testng.annotations.BeforeTest;

import com.org.wiremock.utilities.Testbase;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
public class StubmappingsForRentalCars extends Testbase {


@BeforeTest
public void getmappingsRequestAndResponseForRentalCars() {
	
wireMockserver.stubFor( 
		get(urlEqualTo("/getcars"))
		.withHeader("Content-type",equalTo("application/json; charset=UTF-8"))
            .willReturn(
            		aResponse()
            		.withStatus(200)
                .withHeader("Content-Type", "application/json;charset=UTF-8")
                .withBodyFile("RentalCarsSchema.json")
                ));




}



}















