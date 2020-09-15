package JAVACODILITY;

import java.util.ArrayList;
import java.util.Iterator;

public class Java8 {
//Store user defined employee objects into arraylist and Remove duplicates from arraylist without using collections.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Emp s1=new Emp(101,"Sonoo",23);  
		  Emp s2=new Emp(102,"Ravi",21);  
		  Emp s3=new Emp(102,"Ravi",21);  
		  //creating arraylist  
		  ArrayList<Emp> al=new ArrayList<Emp>();  
		  al.add(s1);//adding Student class object  
		  al.add(s2);  
		  al.add(s3);  
		  
		  //Getting Iterator  
		  Iterator itr=al.iterator();  
		  //traversing elements of ArrayList object  
		  while(itr.hasNext()){  
		    Emp st=(Emp)itr.next();  
		    System.out.println(st.eno+" "+st.name+" "+st.age);  
		 
		 }  
			for(int i=0;i<al.size();i++){
				 
				 for(int j=i+1;j<al.size();j++){
				            if(al.get(i).equals(al.get(j))){
				                al.remove(j);
				                j--;
				            }
				    }
				 
				 }
			
			
			Iterator itr1=al.iterator();  
			  //traversing elements of ArrayList object  
			  while(itr1.hasNext()){  
			    Emp st1=(Emp)itr1.next();  
			    System.out.println(st1.eno+" "+st1.name+" "+st1.age);  
			 
			 }  
				    
				 
				}
		 
		 




}  
     







	
class Emp{  
 int eno;  
 String name;  
 int age;  
 Emp(int no,String name,int age){  
  this.eno=no;  
  this.name=name;  
  this.age=age;  
 }  
}  


	


