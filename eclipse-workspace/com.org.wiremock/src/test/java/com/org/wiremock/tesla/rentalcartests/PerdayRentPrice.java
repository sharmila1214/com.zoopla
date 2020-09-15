package com.org.wiremock.tesla.rentalcartests;

public class PerdayRentPrice implements Comparable<PerdayRentPrice>{

public String sVin;
public float fPrice;
public float fPriceAfterDiscount;
  

public PerdayRentPrice(String vin,float price) {
	this.sVin=vin;
	this.fPrice=price;
}


public int compareTo(PerdayRentPrice obj) {

return (int)((float) this.fPrice-obj.fPrice);



}
}