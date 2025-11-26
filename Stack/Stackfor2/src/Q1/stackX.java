package Q1;

public class stackX {
	private char [] stackarray;
	private int top;
	private int max;
	
	public stackX(int m) {
		max = m;
		top = -1;
		stackarray = new char[max];
	}
	
	public void push(char num) {
		if(top==max-1) {
			System.out.println("Stack is full !");
		}else {
			stackarray[++top]= num;
		}
	}
	public char pop() {
		if(top==-1) {
			System.out.println("Stack is empty !");
			return (char) -99;
		}else
		{
			return stackarray[top--];
		}
	}
	public char peak() {
		if(top==-1) {
			System.out.println("Stack is empty !");
			return (char) -99;
		}else
		{
			return stackarray[top];
		}
	}
	public boolean isempty() {
		return (top==-1);
	}
	public boolean isfull() {
		return (top==max-1);
	}
	
	}


