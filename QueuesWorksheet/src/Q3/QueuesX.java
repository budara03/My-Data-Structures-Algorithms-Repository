package Q3;

public class QueuesX {
	public String cqueue[];
	public int Maxsize;
	public int front;
	public int rear;
	public int nItems;
	
	public QueuesX(int size) {
		Maxsize = size;
		cqueue=new String [Maxsize];
		front = 0;
		rear= -1;
		nItems = 0;
	}
	
    public void insert(String n) {
    	if(nItems==Maxsize) {
    		System.out.println("Full !");
    	}else
    	{
    		if(rear==Maxsize-1) {
    			rear = -1;
    		}else {
    			cqueue[++rear]=n;
    			nItems ++;
    		}
    	}
    }
    public String remove() {
    	if(nItems==0) {
    		System.out.println("Empty !");
    		return null;
    	}else
    	{
    		String  temp = cqueue[front++];
    		if(front==Maxsize) {
    			front=0;
    		}
    		nItems--;
    		return temp;
    	}
    }
    public String PeekFront() {
    	if(nItems==0) {
    		System.out.println("Empty !");
    		return null;
    	}else
    	{
    		String  temp = cqueue[front];
    		if(front==Maxsize) {
    			front=0;
    		}
    		return temp;
    	}
    }
	
	//Implement isEmpty() and isFull() methods of the circular queue class.
    
    public boolean isEmpty() {
    	if(nItems==0) {
    		return true;
    	}else {
    		return false;
    	}
    }
    public boolean isFull() {
    	if(nItems==Maxsize) {
    		return true;
    	}else {
    		return false;
    	}
    }

}
