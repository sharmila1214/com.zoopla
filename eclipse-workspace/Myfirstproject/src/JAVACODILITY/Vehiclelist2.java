package JAVACODILITY;

public class Vehiclelist2 {
	public int vnumber;
	public String vmodel;
	public int vwaitime;
	public Vehiclelist2(int num,String model,int dur) {
		this.vmodel=model;
		this.vnumber=num;
		this.vwaitime=dur;
	}
		public int compareTo(Vehiclelist2 obj) {
			// TODO Auto-generated method stub
			return obj.vwaitime-this.vwaitime;
		}

}
