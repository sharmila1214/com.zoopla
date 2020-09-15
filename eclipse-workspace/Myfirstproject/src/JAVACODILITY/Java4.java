package JAVACODILITY;

import java.util.HashSet;
import java.util.TreeSet;
// java program to store 5 unique elements in sorted order. Error should exist if user tries to add duplicates.
public class Java4 {
	public static void main(String args[])  
    { 
        // creating a TreeSet 
        TreeSet hs = new TreeSet(); 
          
        // adding elements to hashset 
        // using add() method 
        boolean b1 = hs.add("cat"); 
        boolean b2 = hs.add("dog"); 
          
        // adding duplicate element 
        boolean b3 = hs.add("cat"); 
          
        // printing b1, b2, b3 
        System.out.println("b1 = "+b1); 
        System.out.println("b2 = "+b2); 
        System.out.println("element already added  = "+b3); 
          
        // printing all elements of Treeset 
        System.out.println(hs); 
              
    } 
}
