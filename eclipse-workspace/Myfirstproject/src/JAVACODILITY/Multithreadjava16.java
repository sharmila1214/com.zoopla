package JAVACODILITY;
//Write a java program to create three threads T1, T2 and T3 and ensure sequence T1,T2,T3 in java.
public class Multithreadjava16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Seqrun se= new Seqrun();
Thread t1=new Thread (se);
Thread t2=new Thread(se);
Thread t3=new Thread(se);

try {
//First Thread
t1.start();
t1.join();
//SecondThread
t2.start();
t2.join();
//ThirdThread
t3.start();
t3.join();

	}

catch(Exception e) {
	e.printStackTrace();
}
}
	}
	class Seqrun implements Runnable{
		public void run() {
			try {
				Thread.sleep(1000);		
			}
		catch (Exception e) {
			e.printStackTrace();
		}
			System.out.println("In run method " + Thread.currentThread().getName()); 
		}
		
	}
