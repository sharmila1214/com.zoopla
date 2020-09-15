package JAVACODILITY;

import java.util.ArrayList;

public class Removedupjava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> emp = new ArrayList<Object>();
	    
	    emp.add("suresh");
	    emp.add(34);
	    emp.add("raghu");
	    emp.add(55);
	    emp.add("sree");
	    emp.add(10);
	    emp.add("raghu");
	    emp.add(14);
	    
	    
	System.out.println("Before Remove Duplicate elements:"+emp);
	 
	for(int i=0;i<emp.size();i++){
	 
	 for(int j=i+1;j<emp.size();j++){
	            if(emp.get(i).equals(emp.get(j))){
	                emp.remove(j);
	                j--;
	            }
	    }
	 
	 }
	 
	    System.out.println("After Removing duplicate elements:"+emp);
	 
	}

	}


