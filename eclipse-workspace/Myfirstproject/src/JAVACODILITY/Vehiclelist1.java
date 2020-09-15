package JAVACODILITY;

public class Vehiclelist1 implements Comparable<Vehiclelist1>{
public int vnumber;
public String vmodel;
public int vwaitime;
public Vehiclelist1(int num,String model,int dur) {
	this.vmodel=model;
	this.vnumber=num;
	this.vwaitime=dur;
}
	@Override
	public int compareTo(Vehiclelist1 obj) {
		// TODO Auto-generated method stub
		return obj.vwaitime-this.vwaitime;
	}

}
