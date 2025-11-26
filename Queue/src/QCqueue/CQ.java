package QCqueue;

public class CQ {
	
	public char [] array;
	int Max;
	int rear;
	int front;
	int nIterms;
	
	
	public CQ (int n) {
		Max = n;
		array = new char [Max];
		rear = -1;
		front=0;
		nIterms=0;
	}
	public void insert(char x) {
		if(rear==nIterms) {
			System.out.println("Full");
		}
		else {
			if(rear== Max-1) {
				rear=-1;
			}
			nIterms++;
			array[++rear]=x;
		}
	}
	public char remove() {
		if(nIterms==0) {
			System.out.println("Empty!");
			return (char) -99;
		}
		else {
			char temp = array[front++];
			if(front==Max) {
				
				front=0;
			}
			nIterms--;
			return temp;
		}
	}
	public char peekfront() {
		if(nIterms==0) {
			System.out.println("Empty!");
			return (char) -99;
		}else {
			return array[front];
		}
	}
	public boolean isEmpty() {
		return (nIterms==0);
	}

}
