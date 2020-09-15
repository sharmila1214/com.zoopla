package JAVACODILITY;

import java.util.ArrayList;
import java.util.Scanner;

// Store n number of drinktype with quantity. If user wants a drink, user should enter drinktype.
//If drink quantity is greater than one then request should be served and decrease the corresponding quantity by one 
//else no availability message should be printed on screen
public class Java20 {

public static void  main(String args[]) {
	
ArrayList<Store>  st=new ArrayList<>();

st.add(new Store("cococola",5));

st.add(new Store("pepsi",4));
st.add(new Store("fanta",6));
st.add(new Store("sprite",2));
st.add(new Store("thumpsup",7));

System.out.println("Enter drink type");
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
System.out.println("Enter drink quantity");

int quantity=sc.nextInt();
for(int i=0;i<st.size();i++) {
if(str.equals(st.get(i).drinktype)&&st.get(i).drinkquantity>=quantity) {

	System.out.println("request has been served");
st.get(i).drinkquantity=-quantity;
	
}
else if(str.equals(st.get(i).drinktype)&&st.get(i).drinkquantity<quantity) {
System.out.println("not available")	;
}}
}}
 class Store {
public String drinktype;
public int drinkquantity;

public Store(String dtype,int quantity) {
	this.drinktype=dtype;
	this.drinkquantity=quantity;
	
}
 }	


