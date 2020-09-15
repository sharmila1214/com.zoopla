package JAVACODILITY;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Treesetjava4 {

	public static void main(String args[]) {
		ArrayList<Integer> li1=new ArrayList<Integer>();
		li1.add(34);
		li1.add(89);
		
		li1.add(43);
		li1.add(37);
		li1.add(32);
		
	Collections.sort(li1);
	System.out.println(li1);
	int count=0;
	for(int i=0;i<li1.size();i++)
	{
		for(int j=0;j<li1.size();j++) {
		if(li1.get(i).equals(li1.get(j))) {
			
			count++;
	
		}
		}
	}
	if(count>1) {
		System.out.println("dups not allowed");
	}
	else
		System.out.println("no dups");
	}
	}

