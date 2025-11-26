package Q1;

import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner (System.in);
		CQ Queue1 = new CQ (50);
		CQ Queue2 = new CQ (50);
		
		System.out.println("Enter the Number of Inputs :");
		int n= s1.nextInt();
		s1.nextLine();
		
		for(int i =0;i<n;i++) {
			System.out.println("Enter the Letter");
			char ch = s1.nextLine().charAt(0);
			Queue1.insert(ch);
		}
		System.out.println("Enter the Letter you want to delete");
		char dele = s1.nextLine().charAt(0);
		
		while(!Queue1.isEmpty()) {
			char temp=Queue1.remove();
			if(temp!=dele) {
				Queue2.insert(temp);
			}
		}
		while(!Queue2.isEmpty()) {
			System.out.println(Queue2.remove());
		}

	}

}
