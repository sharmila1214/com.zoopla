package JAVACODILITY;

class Ticketreserv{  
	public int totalseats=10;
	 synchronized void print(int n){//synchronized method  
	   if(totalseats>=n) {
		   totalseats=totalseats-n;
		 System.out.println(" allocated  "+n+" seats "+Thread.currentThread().getName());}
		 else {
			 System.out.println("no seats for "+Thread.currentThread().getName());
			 
		 }
		
	     try{  
	      Thread.sleep(400);  
	     }catch(Exception e){
	    	 System.out.println(e);}  
	   }  
	  
	  
	}  
	  
	public class Java17{  
	public static void main(String args[]){  
	final Ticketreserv obj = new Ticketreserv();//only one object  
	  
	Thread t1=new Thread(){  
	public void run(){  
	obj.print(6);  
	}  
	};  
	Thread t2=new Thread(){  
	public void run(){  
	obj.print(3);  
	}  
	};  
	Thread t3=new Thread(){  
		public void run(){  
		obj.print(5);  
		}  
		};   
	t1.start();  
	t2.start(); 
	t3.start();
	
	try {
		t1.join();
		t2.join();
		t3.join();
	}
	catch(Exception e) {
		
	}
	}  
	}  
	
	
	
	
	
	
	
	
	
	
	

