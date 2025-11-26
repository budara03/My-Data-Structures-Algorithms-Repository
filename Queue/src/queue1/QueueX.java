package queue1;

public class QueueX {
	
	private int []queArray;
	private int maxsize;
	private int front;
	private int rear;
	private int nItems;
	
	public QueueX (int s) {
		maxsize = s;
		queArray = new int [maxsize];
		front = 0;
		rear = -1;
		nItems = 0;
		
	}
	public void insert(int j) {
		if(rear==maxsize - 1) {
			System.out.println("Queue is Full !");
		}else {
			queArray[++rear] = j;
		    nItems ++;
		}
		
		
	}
    public  int remove() {
    	if(nItems == 0) {
    		System.out.println("Queue is Empty !");
    		return -99;
    	}
    	nItems --;
    	return queArray[front++];
	}
    public  int PeekFront() {
    	if(nItems == 0) {
    		System.out.println("Queue is Empty !");
    		return -99;
    	}
    	return queArray[front ];
	}
   
    
	

}
