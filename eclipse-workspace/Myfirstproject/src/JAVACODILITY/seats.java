package JAVACODILITY;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

 final public class seats {
	

		seats() throws IOException {
		    DataOutputStream di1 = new DataOutputStream(new FileOutputStream(
		            "\\PlaneReservation\\bin\\a.bin"));
		    DataOutputStream di2 = new DataOutputStream(new FileOutputStream(
		            "\\PlaneReservation\\bin\\b.bin"));

		    di1.writeInt(300);
		    di2.writeInt(200);
		    di1.flush();
		    di2.flush();
		    di1.close();
		    di2.close();
		}

		public int getseatsinplanex(String s) throws IOException {
		    if (s.equals("AAA")) {
		        FileInputStream fis1 = new FileInputStream("\\PlaneReservation\\bin\\a.bin");
		        DataInputStream dis1 = new DataInputStream(fis1);
		        int number = 0;
		        boolean eof = false;
		        while (!eof) {
		            try {
		                number = dis1.readInt();
		            //  System.out.println(number);
		            } catch (EOFException eofx) {
		                eof = true;
		                dis1.close();
		            }
		        }
		        return number;
		    } else if (s.equals("BBB")) {
		        FileInputStream fis2 = new FileInputStream("\\PlaneReservation\\bin\\b.bin");
		        DataInputStream dis2 = new DataInputStream(fis2);
		        int number = 0;
		        boolean eof = false;
		        while (!eof) {
		            try {
		                number = dis2.readInt();
		                //System.out.println(number);
		            } catch (EOFException eofx) {
		                eof = true;
		                dis2.close();
		            }
		        }
		        return number;
		    }
		    return 0;
		 }
		}


