package JAVACODILITY;
// Write a java program to implement your own stack data structure to store any number of items. 
//And implement the following operations 1.push 2. pop 3. peek 4.display stack content
public class StackasLinkedlistjava10 {
	StackNode root; 
	  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data; 
        } 
    } 
  
    public boolean isEmpty() 
    { 
        if (root == null) { 
            return true; 
        } 
        else
            return false; 
    } 
  
    public void push(int data) 
    { 
        StackNode newNode = new StackNode(data); 
  
        if (root == null) { 
            root = newNode; 
        } 
        else { 
            StackNode temp = root; 
            root = newNode; 
            newNode.next = temp; 
        } 
        System.out.println(data + " pushed to stack"); 
    } 
  
    public int pop() 
    { 
        int popped = Integer.MIN_VALUE; 
        if (root == null) { 
            System.out.println("Stack is Empty"); 
        } 
        else { 
            popped = root.data; 
            root = root.next; 
        } 
        return popped; 
    } 
  
    public int peek() 
    { 
        if (root == null) { 
            System.out.println("Stack is empty"); 
            return Integer.MIN_VALUE; 
        } 
        else { 
            return root.data; 
        } 
    } 




public static void main(String[] args) 
{ 

    StackasLinkedlistjava10 sll = new StackasLinkedlistjava10(); 

    sll.push(10); 
    sll.push(20); 
    sll.push(30); 

    System.out.println(sll.pop() + " popped from stack"); 

    System.out.println("Top element is " + sll.peek()); 
} 
} 

