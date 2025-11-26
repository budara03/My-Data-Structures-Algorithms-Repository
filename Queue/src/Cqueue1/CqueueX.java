package Cqueue1;

public class CqueueX {

	
	private int []queArray;
	private int maxsize;
	private int front;
	private int rear;
	private int nItems;
	
	public CqueueX (int s) {
		maxsize = s;
		queArray = new int [maxsize];
		front = 0;
		rear = -1;
		nItems = 0;
		
	}
	public void insert(int j) {
		if(nItems==maxsize) {
			System.out.println("Queue is Full !");
		}else {
			if(rear== maxsize-1 ) {
				rear = -1;
			}
			queArray[++rear] = j;
		    nItems ++;
		}
		
		
	}
    public  int remove() {
    	if(nItems == 0) {
    		System.out.println("Queue is Empty !");
    		return -99;
    	}
    	
    	
    	int temp = queArray[front++];
    	if(front==maxsize) {
    		front = 0 ;
    	}
    	nItems --;
    	return temp ;
    	
	}
    public  int PeekFront() {
    	if(nItems == 0) {
    		System.out.println("Queue is Empty !");
    		return -99;
    	}
    	return queArray[front ];
	}
    public boolean isEmpty() {
    	if(nItems == 0) {
    		return true;
    	}
    	return false;
    }
	

}
