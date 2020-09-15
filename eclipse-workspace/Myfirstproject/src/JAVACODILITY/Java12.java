package JAVACODILITY;
import java.util.*;
import java.util.Deque;
import java.util.Iterator;

//double ended queue using linked list, in which implement methods for the following
//i) Insert element at front 
//ii) Delete element at front 
//iii) Insert element at rear 
//iv) Delete element at rear 
//v) Display content of stack

public class Java12 {
	public static void main(String[] args) {
	      Deque<String> d = new LinkedList<String>();
	      d.add("5");
	      d.addFirst("1");
	      d.addLast("9");
	      d.push("7");
	      d.offer("8");
	      d.offerFirst("6");
	      d.offerLast("2");
	      System.out.println("The deque is: " + d);
	      System.out.print("\nDequeue using standard Iterator: ");
	      Iterator i = d.iterator();
	      while (i.hasNext()) {
	         System.out.print(i.next() + " ");
	      }
	      System.out.println("\n\nUsing peek, the element at head of the deque is: " + d.peek());
	      System.out.println("The deque after peek: " + d);
	      System.out.println("\nUsing pop, the element removed from the head of the deque is: " + d.pop());
	      System.out.println("The deque after pop: " + d);
	      System.out.println("\nDoes the deque contain element 8: " + d.contains("8"));
	      d.removeFirst();
	      d.removeLast();
	      System.out.println("\nDeque after removing the first and last elements is: " + d);
	   }
	}

