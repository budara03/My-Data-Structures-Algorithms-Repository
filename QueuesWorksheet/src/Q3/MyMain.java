package Q3;

public class MyMain {

	public static void main(String[] args) {
	QueuesX cq = new QueuesX (5) ;
	
	cq.insert("l");
	cq.insert("m");
	cq.insert("n");
	cq.insert("o");
	
	while(!cq.isEmpty()) {
		System.out.println(cq.remove());
	}

	}

}
