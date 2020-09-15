package JAVACODILITY;

import java.util.Iterator;
import java.util.Objects;
import java.util.PriorityQueue;



public class Minimumpriorityqueue {

public static void main(String[] args) {
	        
	       Student11 s1=new Student11("Rajeev",12);
	       Student11 s2=new Student11("sree",19);
	       Student11 s3=new Student11("poonam",15);
	       Student11 s4=new Student11("hari",10);
	       Student11 s5=new Student11("dheeri",13);
	       Student11 s6=new Student11("allu",11);
	       
	       PriorityQueue<Student11> Spq = new PriorityQueue<>();

	       
	        Spq.add(s1);
	       
	        Spq.add(s2);
	        Spq.add(s3);
	        Spq.add(s4);
	        Spq.add(s5);
	        Spq.add(s6);
	        
	        for(Student11 b:Spq){  
	            System.out.println(b.getid()+" "+b.getName());  
	            }  
	            Spq.remove();  
	            System.out.println("After removing one record:");  
	            for(Student11 b:Spq){  
	                System.out.println(b.getid()+" "+b.getName());  
	                }  

System.out.println(Spq.peek());
//System.out.println("After removing one record:");  

}
	}


 class Student11 implements Comparable<Student11> {
    private String name;
    private int id;

    public Student11(String name, int  id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getid() {
        return id ;
    }

    public void setid(int id) {
        this.id = id;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//       if (o == null || getClass() != o.getClass()) return false;
//      Student11 student = (Student11) o;
//       return int.compare(student.id, id) == 0 &&
//               Objects.equals(name, student.name);
//   }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

	@Override
	public int compareTo(Student11 o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}

	

















}
