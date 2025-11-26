package Q4;

public class myStack {
	public String stackmy[];
	public int top;
	public int Maxsize ;
	
	public myStack(int size) {
		top = -1;
		Maxsize = size;
		stackmy = new String [Maxsize];
	}
	public void  push(String n) {
		if(top==Maxsize-1) {
			System.out.println("Full !");
		}
		else {
			stackmy[++top]=n;
		}
	}
	public String  pop() {
		if(top==-1) {
			System.out.println("empty !");
			return null;
		}
		else {
			return stackmy[top--];
		}
	}
	public String  peek() {
		if(top==-1) {
			System.out.println("empty !");
			return null;
		}
		else {
			return stackmy[top];
		}
	}
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		else {
			return false;
		}
	}

}
