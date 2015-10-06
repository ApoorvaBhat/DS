

class Node {

//  protected int data;
//	protected Node link;
	int data;
	Node next;

 	 public Node() {

        next = null;
		data = 0;
    }    

   	public Node(int d,Node n) {

        data = d;
        next = n;
    }    

    /*  Method to set link/poointer to next Node  */  
    public void setNext(Node n){

        next = n;
	}    
	
	/*  Method to set data to current Node  */
	 public void setData(int d) {
        data = d;
	}    
 /*  Function to get link/pointer to next node  */

    public Node getNext() {

        return next;
	}    

    /*  Function to get data from current Node  */

    public int getData() {

        return data;

    }

}    

 
