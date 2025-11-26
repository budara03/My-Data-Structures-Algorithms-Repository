package LinkListex03;

public class Link {

	int iData;
	Link next;
	public Link(int iData) {
		this.iData = iData;
		this.next = null;
	}
	
	void displaylink() {
		System.out.println(iData);
	}
	
}
