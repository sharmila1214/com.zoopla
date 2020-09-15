package JAVACODILITY;

import java.util.ArrayList;
import java.util.Iterator;
//Write a java program to implement your own ArrayList which has two methods
//a) add b) remove and store 5 student information in your ArrayList.
public class Arraylistjava7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					  //Creating user-defined class objects  
			  Student1 s1=new Student1(101,"Sonoo",23);  
			  Student1 s2=new Student1(102,"Ravi",21);  
			  Student1 s3=new Student1(103,"Hanumat",25);  
			  //creating arraylist  
			  ArrayList<Student1> al=new ArrayList<Student1>();  
			  al.add(s1);//adding Student class object  
			  al.add(s2);  
			  al.add(s3);  
			  
			  //Getting Iterator  
			  Iterator itr=al.iterator();  
			  //traversing elements of ArrayList object  
			  while(itr.hasNext()){  
			    Student1 st=(Student1)itr.next();  
			    System.out.println(st.rollno+" "+st.name+" "+st.age);  
			 
			 }  
			  al.remove(0);
			  System.out.println();
	
			  Iterator itr1=al.iterator();  
			  //traversing elements of ArrayList object  
			  while(itr1.hasNext()){  
			    Student1 st=(Student1)itr1.next();  
			    System.out.println(st.rollno+" "+st.name+" "+st.age);  
			 
			 }  
	
	
	
	
	}  
          







}	
class Student1{  
	  int rollno;  
	  String name;  
	  int age;  
	  Student1(int rollno,String name,int age){  
	   this.rollno=rollno;  
	   this.name=name;  
	   this.age=age;  
	  }  
	}  

