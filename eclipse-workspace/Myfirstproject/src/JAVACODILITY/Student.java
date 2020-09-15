package JAVACODILITY;

public class Student implements Comparable<Student>{

public String sname;
public int sregno;
public int smarks;
public Student(String name,int regno,int marks){
	this.sname=name;
	this.sregno=regno;
	this.smarks=marks;
}



@Override
public int compareTo(Student obj) {
	return obj.smarks-this.smarks;
}
}
