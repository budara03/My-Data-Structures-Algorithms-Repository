package Cqueue1;

public class queueMain {

	public static void main(String[] args) {
		CqueueX cq1 = new CqueueX(10);
		
		cq1.insert(10);
		cq1.insert(25);
		cq1.insert(55);
		cq1.insert(65);
		cq1.insert(85);
		
	while(!cq1.isEmpty()) {
		System.out.println(cq1.remove());
	}
		

	}

}
