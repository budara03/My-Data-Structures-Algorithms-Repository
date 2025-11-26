package Linkliat1;

public class Link1 {
	
	public int iData;
	public Link1  next;
	
   public Link1 (int d) {
		iData = d;
		next = null;
	}
	
	public void displayLink() {
		System.out.println(iData);
	}            
	

}
