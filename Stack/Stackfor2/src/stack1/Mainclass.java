package stack1;

public class Mainclass {

	public static void main(String[] args) {
		stackX X = new stackX (10);
		
		X.push(2);
		X.push(9);
		X.push(8);
		X.push(3);
		
	    System.out.println(X.peak());
		while(!X.isempty()) {
			X.pop();
		}

	}

}
