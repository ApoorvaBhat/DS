
 //Unlike Queue which is FIFO .Here we can add or remove elements from both beginning and end.Similar to Double Linked List.

class Dequeue{

     private Node front, rear;//like head & tail.
     private int size;

    public Dequeue(){

        front = null;
        rear = null;
		size = 0;
	 }    
 /*  Function to check if queue is empty */
 
	 public boolean isEmpty() {

        return front == null;
	} 
	   
 /*  Function to get the size of the queue */
 
 	 public int getSize(){
		 return size;
	}

/* Clear dequeue */
	 public void clear(){

        front = null;
		rear = null;
		size = 0;
	}
	
/*  Function to insert an element at begining of queue */

	 public void insertAtFront(int val) {

        Node n1 = new Node(val, null);    
		size++ ;    
	
        if (front == null) {//empty queue
			 front = n1;
			 rear = front;
		}
		 else {

            n1.setNext(front);
			front = n1;
         }

    }
/*  Function to insert an element at end  */
	 public void insertAtRear(int val) {

        Node last = new Node(val,null);    
		size++ ;    
        if (rear == null)  {//single node /single element in queue.
			 rear = last;

            front = rear;
         }
		else {
			rear.setNext(last);
			rear = last;
		}
	 }    

 /*  Function to remove front element from the queue */

    public int removeAtFront() throws NoSuchElementException {

        if (isEmpty() )
			throw new NoSuchElementException();

	    Node p = front;
		front = p.getNext();

 		 if (front == null)//empty queue.
			rear = null;

        size-- ;
	    return p.getData();
	 }
	 
 /*  Function to remove rear element from the queue */
//rmv using 2 pointers.
    public int removeAtRear() throws NoSuchElementException {

        if (isEmpty() )
			throw new NoSuchElementException("Underflow Exception");

        int ele = rear.getData();
		Node p = front;
		Node q = front;

        while (p != rear) {
			q = p;
            p = p.getNext();
        }
		
        rear = q;
        rear.setNext(null);
        size --;
		return ele;

    }        

/*  Function to check the front element of the queue */

    public int peekAtFront() throws NoSuchElementException {

        if (isEmpty() )
			 throw new NoSuchElementException("Underflow Exception");

        return front.getData();
	 }

    
/*  Function to check the last element of the queue */
	 public int peekAtRear() throws NoSuchElementException{

        if (isEmpty() )
			throw new NoSuchElementException("Underflow Exception");

        return rear.getData();

    }    

    /*  Function to display the status of the queue */

    public void display() {

        System.out.print("\nDequeue elements are = ");

        if (size == 0) {
            System.out.print(" queue is Empty\n");
		
       return ;
		 }
	//return;
         Node p = front;
		 while (p != rear.getNext()) {

            System.out.print(p.getData()+" ");
			p = p.getNext();
		 }
		 System.out.println();        

    }

}

 

