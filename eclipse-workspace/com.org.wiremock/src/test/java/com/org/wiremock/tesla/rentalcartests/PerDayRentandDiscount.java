package com.org.wiremock.tesla.rentalcartests;

public class PerDayRentandDiscount  implements Comparable<PerDayRentandDiscount>{
	public String sVin;
	
public float fpriceafterdiscount;

public PerDayRentandDiscount(String vin,float priceafterdiscount)
{
	this.sVin=vin;
	this.fpriceafterdiscount=priceafterdiscount;
}
public int compareTo(PerDayRentandDiscount obj) {
	return (int)((float) this.fpriceafterdiscount-obj.fpriceafterdiscount);
	
}

}
