package Stack1;

public class stackX {
	private double [] stackArray;
	private int top;
	private int Maxsize;


public stackX (int s) {
	Maxsize = s;
	stackArray = new double [Maxsize];
	top = -1;
}

public void push(double i) {
	if(top ==Maxsize -1) {
		System.out.print("Stack is Full !");
	}else {
		stackArray[++top]=i;
	}
}	
	public double pop() {
		if(top == -1) {
			System.out.print("Stack is Empty");
			return -99;
		}
		else
		return stackArray[top--];
	}
	public double peek() {
		if(top == -1) {
			System.out.print("Stack is Empty");
			return -99;
		}
		else
		return stackArray[top];
	}
	public boolean isEmpty() {
		return (top==-1);
	}
	public boolean isFull() {
		return (top== Maxsize-1);
	}

}