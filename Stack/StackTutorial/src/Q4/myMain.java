package Q4;

public class myMain {

	public static void main(String[] args) {
		myStack s1 = new myStack(5);
		s1.push("g");
		s1.push("t");
		s1.push("o");
		s1.push("p");
		
		while(!s1.isEmpty()) {
			System.out.println(s1.pop()); 
		}

	}

}
