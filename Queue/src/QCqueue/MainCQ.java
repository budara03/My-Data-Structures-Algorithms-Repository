package QCqueue;

import java.util.Scanner;

public class MainCQ {

	public static void main(String[] args) {
		Scanner s1 = new Scanner (System.in);
		CQ Queue1 = new CQ (50);
		
		char [] input = new char [5];
		
		
		System.out.println("Enter 5 Letters in accending order :");
		for(int i =0 ;i<5;i++) {
			input[i]= s1.next().charAt(0);
		}
		
		for (int i=4 ;i>=0;i--) {
			Queue1.insert(input[i]);
		}
		
		for(int i = 0 ;i<5;i++) {
			Queue1.insert(input[i]);
		}
		while(!Queue1.isEmpty()) {
			System.out.print(Queue1.remove()+" ");
		}

	}

}
