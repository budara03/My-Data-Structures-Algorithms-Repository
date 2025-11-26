package StackChar;

public class Stackchar {
	
	private char [] CharStack;
	private int Max;
	private int top;
	
public Stackchar (int n) {
	
	Max = n;
	top = -1;
	CharStack = new char [Max];
	
	
}

public void push(char C) {
	if(top==Max-1) {
		System.out.println("Stack is FULL!");
	}else {
		CharStack[++top]= C;
	}
}
public char pop() {
		if(top==-1) {
			System.out.println("Stack is Empty!");
			return (char) -99;
		}else {
			return CharStack[top--];
		}
	
}
public char peek() {
	if(top==-1) {
		System.out.println("Stack is Empty!");
		return (char) -99;
	}else {
		return CharStack[top];
	}

}
public boolean isEmpty() {
	return (top==-1);
}
public boolean isFull() {
	return (top==Max-1);
}

	
}