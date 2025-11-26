package Stack2;

public class stack0 {
	private double [] arrayO;
	private int top;
	private int Maxsize;
	
	
	public stack0(int m){
		Maxsize = m;
		arrayO = new double [Maxsize];
		top = -1;
		
	}
	public void push(double num) {
		if(top==Maxsize-1) {
			System.out.println("Full");
		}else {
			arrayO[++top]= num;
		}
	}
	public double pop() {
		if (top==-1) {
			System.out.println("Empty!");
			return -99;
		}else  {
			return arrayO[top--];
		}
	
		
	}
	public double peek() {
		if (top==-1) {
			System.out.println("Empty!");
			return -99;
		}else  {
			return arrayO[top];
		}
	}
	public boolean isempty() {
		return (top==-1);
	}
	

}
