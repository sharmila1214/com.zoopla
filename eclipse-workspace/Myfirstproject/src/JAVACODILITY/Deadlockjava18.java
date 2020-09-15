package JAVACODILITY;
// What is the cause of deadlock in java multithreading. Write a program to create deadlock between two threads

public class Deadlockjava18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final String resource1="animal";
final String resource2="cat";
Thread t1=new Thread() {
  public void run() {
	synchronized(resource1){
	System.out.println("thread1 locked resorce1")	;
	
	try {
		Thread.sleep(100);
	}
	
	catch(Exception e) {
		
	}
	System.out.println("Thread 1: Waiting for lock 2...");
	synchronized (resource2) {  
		System.out.println("Thread1 locked resource2");
	}
	
	}
	}
};

Thread t2= new Thread() {
	
public void run() {
	
synchronized (resource2){
	System.out.println("Thread2 locked resource2");

                try {
                    Thread.sleep(100);	
                 }

            catch(Exception e) {
	
                     }
                System.out.println("Thread 2: Waiting for lock 1...");
    synchronized(resource1) {
	System.out.println("Thread2 locked resource1");
}
}
}
};

t1.start();
t2.start();
	}
}































	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


