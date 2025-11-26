package Linkliat1;

public class LinkList {
	
	private  Link1 first;
	
	
	public LinkList() {
		
		first = null;
	}
	public boolean isEmpty() {
		if(first == null) {
			return true;
		}
		else 
			return false ;
	}
	public void displayLinkList() {
		Link1 Current = first;
		
		while(Current!=null) {
			Current.displayLink();
			Current=Current.next;
		}
		System.out.println("");
	}
	public Link1 find(int key) {
		
		Link1 Current = first;
		while (Current!= null) {
			if(Current.iData ==key) {
				return Current;
			}else 
				Current = Current.next;
		}
		return null ;x
	}
	
	//Insert First 
	public void InsertFirst(int key) {
		Link1 nl = new Link1(key);
		nl.next= first;
		first = nl;
	}
	//Delete First 
	public Link1 DeleteFirst() {
		Link1 del = first;
		first = del.next;
		return del; 
	}

}
