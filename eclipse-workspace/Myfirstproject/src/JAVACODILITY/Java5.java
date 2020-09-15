package JAVACODILITY;


import java.util.Scanner;
//Write a program to read monetary amount in cents and print the smallest possible number of coins equaling the amount. 
//Example: monetary amount in cents=288 2 Dollar 3 quarter 1 dime 3 pennies So smallest possible number of coins equaling the amount 283====9 coins
public class Java5 {
	 public static void main(String [] args) {
	     Scanner in = new Scanner(System.in);

	     int amounts; //input variables
	     int dollars , quarters , dimes, nickels , pennies ; //output variables
	     double totalValue;
	     int numberofcoins;
	     double dollarsValue= 1.00;
	     double quartesValue= 0.25;
	     double dimes1= 0.10;
	     double nickelsValue= 0.05;
	     double penniesValue= 0.01;
	     System.out.print("Enter an amount in cent:");
	     amounts = in.nextInt();

	  //steps for computing dollars, quarters, dimes, nickels, and
	  //pennies 

	   

	     System.out.print("number of dollars");
	     dollars= in.nextInt();
	     System.out.print("number of quarters");
	     quarters= in.nextInt();

	     System.out.print("number of dimes");
	     dimes1= in.nextInt();
	     System.out.print("number of nickels");
	     nickels= in.nextInt();
	     System.out.print("number of pennies");
	     pennies= in.nextInt();

	     numberofcoins=(int) (dollars+quarters+dimes1+nickels+pennies);
	     totalValue=(dollars+quarters+dimes1+nickels+pennies);
	      //prinitng  values
	       System.out.println("total number of coins" +numberofcoins);

		     System.out.println("number of coins = "+
		     (dollars+quarters+dimes1+nickels+pennies));


	  }
	}
	

















