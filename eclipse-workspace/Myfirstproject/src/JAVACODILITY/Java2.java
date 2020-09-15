package JAVACODILITY;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Iterator;
//Write a java program to store 5 student information and award the students with 1st rank,
//2nd rank and 3rd rank according to marks obtained where each student has student name,
//student marks and student reg no information
public class Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Student> listudent=new LinkedList<>();

		listudent.add(new Student("sharmi",11,300));
		
		listudent.add(new Student("anika",19,800));
		listudent.add(new Student("harri",61,350));
		listudent.add(new Student("tom",31,489));
		listudent.add(new Student("vicky",12,34));
		//System.out.println(listudent);
		
		Collections.sort(listudent);
		Iterator<Student> It1 = listudent.iterator();
	while(It1.hasNext()) {
			
			Student temp = It1.next();
				System.out.println("student info:: "+temp.sregno+"\t Name :: "+temp.sname+"\t Marks "+temp.smarks);
				
		}
		
	System.out.println("1st rank :  "+	listudent.get(0).sname+"\t marks "+listudent.get(0).smarks  +" regno is"+listudent.get(0).sregno);
	System.out.println("2nd rank :  "+	listudent.get(1).sname+"\t marks "+listudent.get(1).smarks+" regno is"+listudent.get(1).sregno);
	System.out.println("3rd rank  : "+	listudent.get(2).sname+"\t marks "+listudent.get(2).smarks+" regno is"+listudent.get(2).sregno);
		
		
	}

}
