package JAVACODILITY;

//Implement minimum priority queue to store student information. 
//Each student has student name(string)and student id number(int) and priority is nothing but student id. 
//Implement the fallowing methods EnQueue()-adds student info to queue which maintains order of minimum prioprity DeQueue()- 
//which deletes minimum id holder information peekMin() which returns student information having minimum id value
	class Queue {
		int front;
	    int rear;
	    int size;
	    int[] queue;
	    int len=0;
	    
	    public Queue(int arraySize){
	    	size=arraySize;
	    	queue=new int[size];
	    	front=-1;
	    	rear=-1;
	    }
	    
	       public void enQueue(int data){
	        if (rear == -1){
	            front = 0;
	            rear = 0;
	            queue[rear] = data;
	        }
	        else if (rear + 1 >= size)
	        	System.out.println("Overflow Exception");
	        else if ( rear + 1 < size)
	            queue[++rear] = data;    
	        len++ ;    
	    }    
	    
	    public void deQueue(){
	        if (front==-1)
	           System.out.println("Underflow Exception");
	        else 
	        {
	            len-- ;
	            if (front == rear) 
	            {
	                front = -1;
	                rear = -1;
	            }
	            else
	                front++;                
	        }        
	    }
	    
	    public void display()
	    {
	        System.out.print("\nQueue = ");
	        if (len == 0){
	            System.out.print("Empty\n");
	            return ;
	        }
	        else{
	        for (int i = front; i <= rear; i++)
	            System.out.print(queue[i]+" ");
	        }
	        System.out.println();
	    }
	    }
	
	
	 
	public class Java15 {
	    public static void main(String[] args) {
	    	Queue newQueue = new Queue(5);
	        newQueue.enQueue(10);
	        newQueue.enQueue(20);
	        newQueue.enQueue(30);
	        newQueue.enQueue(40);
	        newQueue.enQueue(50);
	        
	        newQueue.display();
	        newQueue.deQueue();
	        newQueue.deQueue();
	        newQueue.display();
	        
	    }
}
