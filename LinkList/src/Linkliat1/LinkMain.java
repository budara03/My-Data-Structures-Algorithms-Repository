package Linkliat1;

public class LinkMain {

	public static void main(String[] args) {
		LinkList newList = new LinkList();
		
     newList.InsertFirst(10);
     newList.InsertFirst(20);
     newList.InsertFirst(30);
     newList.InsertFirst(40);
     
     newList.displayLinkList();
    
     while(!newList.isEmpty()) {
    	 Link1 temp = newList.DeleteFirst();
    	 System.out.println("Deleting " + temp.iData);
     } 
	}
	

}
