package JAVACODILITY;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
// java program to store 5 student information in a treeMapNote: student object has student name and student reg no
public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,Integer> treemap=new TreeMap<>();

	treemap.put("ravi", 23);
	treemap.put("shankar", 45);
	treemap.put("anitha",11 );
	treemap.put("vinay",55 );
	treemap.put("alekya", 21);
	for(Map.Entry<String, Integer> entry:treemap.entrySet()) {
		System.out.println("studentname :"  +    entry.getKey()  +   " studentregno :"   +entry.getValue());
	}
	
	
	
	
	
	}

}
