package JAVACODILITY;

public class Transaction {
	public void getPlaneInfo(Plane x){
	    synchronized(this){
	        int number =  x.getSeatCapacity();
	        String planename=x.getPlaneName();
	        System.out.printf("The number of seats in plane %s is %d\n",planename,number);
	    }

	}

	public void reserveSeats(Plane x, int seatstobereserved) {
	    synchronized(this){
	    x.updateSeatCapacity(seatstobereserved);
	    }
	  }
	 }

