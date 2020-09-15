package JAVACODILITY;

import java.util.ArrayList;
import java.util.Arrays;

public class Java3StringtoArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] names= {"cat","dog","goat","parrot"};
ArrayList<String> al = new ArrayList<String>(Arrays.asList(names)); 


System.out.println("converting sTRING TO ARRAYLIST");
for(String n:al) {
	System.out.println(n);

}
System.out.println("converting arraylist to string");
String listString = "";

for (String s : al)
{
    listString += s + "\t";
}

System.out.println(listString);

	}

}
