package Q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s1 = new Scanner (System.in);
		stackX st = new stackX(50);
		stackX temp = new stackX(50);
		
		
		System.out.println("How many Input are you gonna add");
		int num = s1.nextInt();
		s1.nextLine(); 
		
		for(int i=0;i<num;i++) {
			System.out.println("Enter the Letter "+(i+1)+" :");
			char ch = s1.nextLine().charAt(0);
			st.push(ch);
		}
		while(!st.isempty()) {
			System.out.println(st.pop());
		}
		
		

	}

}
