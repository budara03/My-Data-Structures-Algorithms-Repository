package Q2;

public class stack {
	
	public int top;
	public int maxSize ;
	public int [] stackArray;
	
	public stack (int size) {
		maxSize = size ;
		top = -1;
		stackArray = new int [size];
	}
	public void push(int no) {
		if(top==maxSize-1) {
			System.out.println("Stack is Full !");
		}
		else {
			stackArray[++top]=no;
		}
	}
	public int pop() {
		if(top==-1) {
			System.out.println("Stack is Empty !");
			return -99;
		}
		else {
			return stackArray[top--];
		}
	}
	public boolean isEmpty() {
		if(top==-1) {
			System.out.println("Stack is Empty !");
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isFull() {
		if(top==maxSize-1) {
			System.out.println("Stack is Full !");
			return true;
		}
		else {
			return false;
		}
	}
		public int getCount() {
			return top +1;
	}

}
