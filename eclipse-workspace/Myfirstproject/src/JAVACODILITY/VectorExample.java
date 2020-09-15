package JAVACODILITY;

import java.nio.charset.Charset;
import java.util.Vector;
//Write a program to insert "tekarch" into vector then insert user inputed number(N) of Z's from 3rd position
//.delete N charactors from 6th position from vectorExample:if user input =5Then vector stores="tekZZZZZarch"
//Delete 5 character from 6th position so final string="tekZZZh"
public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vector<String> ms= new Vector<>();

	       ms.add("t");
	       ms.add("e");
	       ms.add("k");
	       ms.add("a");
	       ms.add("r");
	       ms.add("c");
	       ms.add("h");
	       for(int i=0;i<5;i++) {
	       ms.add(3,"z");
	       }
	       System.out.println("Vector: " + ms);  
		
		for(int i=0;i<3;i++) {
			ms.remove(6);
		}
			
		System.out.println("Vector: " + ms);  
	    }
	}
	
	


