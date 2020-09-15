package JAVACODILITY;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;
/*java program to implement the fallowing Consider vehicle parking application where each vehicle information 
which enters into the parking location stored in 2 lists. 
at the end of each day these lists to be merged into single list and 
one vehicle information which has highest parked hour should be retrieved, 
where each vehicle information has vehicle number, vehicle model, total duration parked in minutes.*/
public class Entry2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Vehiclelist1> li1=new LinkedList<>();

		li1.add(new Vehiclelist1(566,"audi",6));
		li1.add(new Vehiclelist1(678,"rogue",7));
		li1.add(new Vehiclelist1(543,"bmw",4));
		li1.add(new Vehiclelist1(987,"tesla",3));
	
	
		ArrayList<Vehiclelist2> li2=new ArrayList<>();

		li2.add(new Vehiclelist2(652,"audi",8));
		li2.add(new Vehiclelist2(231,"crv",5));
		li2.add(new Vehiclelist2(432,"nissan",3));
		li2.add(new Vehiclelist2(678,"rover",1));
		ArrayList<Vehiclelist3> merge = new ArrayList<>();
	
		
	
		
	LinkedList<Vehiclelist3> merge1 = new LinkedList<>();
	merge1.addAll(li1);
	merge.addAll(li2);
		//merge.addAll(li1);
		 Iterator i = li1.iterator();
	        while (i.hasNext()) {
	           merge.add((int)i.next());
	        }
	        i=l2.iterator();
	        while (i.hasNext()) {
	            Itmerge.add((int)i.next());
	        }
	System.out.println("L1 : "+li1);
	System.out.println("L2 : "+li2);
	System.out.println("Merged : "+merge);
        for(int i=0;i<li1.size();i++){
           
        }
        for(int i=0;i<li2.size();i++){
            Itmerge.addAll((Collection<? extends Vehiclelist3>) li2.get(i));
        }
System.out.println(Itmerge);
	
	
	
	
	
	}

}
