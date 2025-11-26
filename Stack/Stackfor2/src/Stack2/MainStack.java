package Stack2;

import java.util.Scanner;

public class MainStack {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		stack0  S1 = new stack0 (10);
		
		
			System.out.println("Enter a Number");
			String inputline = scan.nextLine();
			String[] chars = inputline.split(" ");
	
		for ( String s : chars) {
			if(!S1.isempty()) {
				S1.push(s.charAt(0));
			}
		}
		
		System.out.print("Enter character to delete: ");
        char target = scan.next().charAt(0);
        
        stack0 temp = new stack0(20);
        
        while(!S1.isempty()) {
        	char ch = S1.pop();
        	if(ch!= target) {
        		temp.push(ch);
        	}
        }
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

	}

}
