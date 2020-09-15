package JAVACODILITY;

import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Reservejava17 {

	static int queryseatsavailableinx;
	static int queryseatsavailableiny;

	static
	{
	    seats s = null;
	    try {
	        s = new seats();
	    } catch (IOException e1) {
	        // TODO Auto-generated catch block
	        e1.printStackTrace();
	    }
	    try {
	        queryseatsavailableinx = s.getseatsinplanex("AAA");
	        queryseatsavailableiny = s.getseatsinplanex("BBB");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

	static final Plane x1 = new Plane("AAA", 001, queryseatsavailableinx );
	static final Plane y1 = new Plane("BBB", 002, queryseatsavailableiny);
	static final Transaction trans = new Transaction();

	public static void main(String[] args) throws InterruptedException {

	    Thread t1 = new Thread(new Runnable() {

	        public void run() {
	            trans.getPlaneInfo(x1);
	        }
	    });

	    Thread t2 = new Thread(new Runnable() {

	        public void run() {
	            //trans.getPlaneInfo(x1);
	            trans.reserveSeats(x1,3);
	        }
	    });

	    Thread t3 = new Thread(new Runnable() {

	        public void run() {
	            //trans.getPlaneInfo(y1);
	            trans.reserveSeats(y1,8);
	        }
	    });

	    Thread t4 = new Thread(new Runnable() {

	        public void run() {
	            //trans.getPlaneInfo(x1);
	            trans.reserveSeats(x1,2);
	        }
	    });

	    t1.start();
	    t2.start();
	    t3.start();
	    t4.start();

	    t1.join();
	    t2.join();
	    t3.join();
	    t4.join();
	 }

	}









