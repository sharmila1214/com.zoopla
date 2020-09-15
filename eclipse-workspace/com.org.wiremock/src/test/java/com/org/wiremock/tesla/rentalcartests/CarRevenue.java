package com.org.wiremock.tesla.rentalcartests;

public class CarRevenue implements Comparable<CarRevenue>{
	public String sVin;
	
public float fCarRevenue;

public CarRevenue(String vin,float carRevenue)
{
	this.sVin=vin;
	this.fCarRevenue=carRevenue;
}
public int compareTo(CarRevenue obj) {
	return (int)((float) this.fCarRevenue-obj.fCarRevenue);
	
}
}
