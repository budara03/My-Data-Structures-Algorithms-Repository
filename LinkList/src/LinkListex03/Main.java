package LinkListex03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s1 = new Scanner (System.in);
        LinkList L1 = new LinkList();
       
        for(int i = 0 ;i<5;i++) {
        	System.out.println("Enter a Number :");
            L1.Insert(s1.nextInt());
            
        }
        L1.displayLinkList();
        System.out.println();
        L1.delete(40);
        L1.displayLinkList();
        
	}

}
