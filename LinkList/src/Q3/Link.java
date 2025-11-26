package Q3;

public class Link {

	 public int iData;
	 Link next;


public Link(int id) {
	iData = id;
	next = null;
	
}
public void displayLink() {
	System.out.println(iData);
}
}