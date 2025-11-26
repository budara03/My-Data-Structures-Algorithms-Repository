package LinkListex03;

public class LinkList {
	
	Link first;

	public LinkList() {
		
		this.first = null;
	}
	public boolean isEmpty() {
		return (first==null);
	}
	void displayLinkList() {
		Link Current = first;
		while(Current!=null) {
			Current.displaylink();
			Current=Current.next;
		}
	}
	Link find (int Key) {
		Link Current = first;
		while(Current!=null) {
			if(Current.iData==Key)
			{
				return Current;
			}else {
				Current=Current.next;
			}
		}
		return null;
	}
	void Insert(int data) {
		Link L1 = new Link(data);
		L1.next=first;
		first=L1;
		
	}
	boolean insertAfter(int Key,int newData) {
		Link Current = first;
		while(Current!=null) {
			if(Current.iData==Key) {
				Link L1 = new Link(newData);
				L1.next=Current.next;
				Current.next=L1;
				return true;
			}
			else {
				Current=Current.next;
			}
			
		}
		return false;
	}
	Link deleteFirst() {
		Link Current = first;
		first = Current.next;
		return Current;
	}
	
	boolean delete(int key) {
		if(first==null) {
			return false;
		
		}
		Link current = first;
		Link pev = null;
		
		while(current!=null) {
			if(current.iData==key) {
				pev.next=current.next;
				return true;
			}else {
				pev=current;
				current= current.next;
				
			}
		}
		return false;
	}
	

}
