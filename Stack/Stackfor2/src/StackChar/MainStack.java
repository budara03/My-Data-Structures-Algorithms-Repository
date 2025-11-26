package StackChar;

import java.util.Scanner;

public class MainStack {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Stackchar s1 = new Stackchar (50);
		Stackchar temp = new Stackchar (50);
		
		
		
		System.out.print("Enter the Charactors with spaces between each Other :");
		String S = scan.nextLine();
		String [] array = S.split(" ");
		
		for (String a :array) {
			s1.push(a.charAt(0));
		}
		
		System.out.print("Enter the Letter that you want to remove :");
		char remove = scan.next().charAt(0);
		
		
		while (!s1.isEmpty()) {
			char c = s1.pop();
			
			if (c!= remove) {
				temp.push(c);
			}
		}
		while (!temp.isEmpty()) {
			s1.push(temp.pop());
			
		}
		while (!s1.isEmpty()) {
			System.out.println(s1.pop());
			
		}
		
		

	}

}
