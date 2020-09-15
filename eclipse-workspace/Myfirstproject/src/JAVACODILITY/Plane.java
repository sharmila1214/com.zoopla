package JAVACODILITY;

final public class Plane {
	private String planename = null;
	private int planeid = 0;
	private int availableseatcapacity = 0;

	Plane(String planename, int planeid, int seatcapacity) {
	    this.planename = planename;
	    this.planeid = planeid;
	    this.availableseatcapacity = seatcapacity;
	}

	public String getPlaneName() {
	    return planename;
	}

	public int getPlaneId() {
	    return planeid;
	}

	public int getSeatCapacity() {
	    return availableseatcapacity;
	}

	public void updateSeatCapacity(int reservedseats) {
	    availableseatcapacity -= reservedseats;
	    System.out.printf("\n%d Seats successfully reserved and remaining seats " +
	            "in the plane %s are %d\n",reservedseats, planename,availableseatcapacity);

	 }

	}

