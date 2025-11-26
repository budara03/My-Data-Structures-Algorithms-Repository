package LabExercise1Stacks;

public class stackX {
	public double [] stackArray;
	public int top ;
	public int Maxsize ;
	
	public stackX (int j) {
		Maxsize =  j ;
		stackArray = new double [Maxsize]; 
		top = -1;
	}
	
	//Push(), Pop(), Peek(), isEmpty() and isFull() 
	
	public void push(double n) {
		if(top == Maxsize-1) {
			System.out.println("Stack is Full !");
		}
		else {
			stackArray[top++]= n;
			
		}
	}
	public double pop() {
		if(top == -1) {
			System.out.println("Stack is empty !");
			return -99;
		}
		else {
			return stackArray[top--];
			
		}
	}
	public double Peek() {
		if(top == -1) {
			System.out.println("Stack is empty !");
			return -99;
		}
		else {
			return stackArray[top];
			
		}
	}
	public boolean isFull() {
		if(top==Maxsize -1) {
			return true;
		}
		else 
			return false;
	}
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		else 
			return false;
	}
	


}
