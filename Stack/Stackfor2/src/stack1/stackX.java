package stack1;

public class stackX {
	private double [] stackarray;
	private int top;
	private int max;
	
	public stackX(int m) {
		max = m;
		top = -1;
		stackarray = new double[max];
	}
	
	public void push(double num) {
		if(top==max-1) {
			System.out.println("Stack is full !");
		}else {
			stackarray[++top]= num;
		}
	}
	public double pop() {
		if(top==-1) {
			System.out.println("Stack is empty !");
			return -99;
		}else
		{
			return stackarray[top--];
		}
	}
	public double peak() {
		if(top==-1) {
			System.out.println("Stack is empty !");
			return -99;
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


