package LabQ1;
import java.util.Scanner;
public class myMain {

	public static void main(String[] args) {
		
		QueueX mainQueue = new QueueX(5);
		QueueX evenQueue = new QueueX(5);
		QueueX oddQueue = new QueueX(5);
		Scanner s1 = new Scanner(System.in);
		
		for(int i =1 ;i<=5 ;i++) {
			System.out.println("Enter transaction ID" +i +": ");
			mainQueue.insert(s1.nextInt());
		}
		
		while(!mainQueue.isEmpty()) {
			int num = mainQueue.remove();
			if(num%2==0) {
				evenQueue.insert(num);
				System.out.println("Transaction ID " + num + " sent to PC1 (Even)");
			}else {
				oddQueue.insert(num);
				System.out.println("Transaction ID " + num + " sent to PC2 (Odd)");
			}
		}
		System.out.println("PC1");
		while(!evenQueue.isEmpty()) {
		int num = evenQueue.remove();
		System.out.println("Transaction : " +num);
		 
		}
		System.out.println("PC2");
		while(!oddQueue.isEmpty()) {
		int num = oddQueue.remove();
		System.out.println("Transaction : " +num);
		 
		}

	}

}
