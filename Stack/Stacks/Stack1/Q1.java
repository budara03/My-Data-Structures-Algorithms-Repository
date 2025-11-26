package Stack1;

public class Q1 {

	public static void main(String[] args) {
		
		stackX s1 = new stackX(10);
		
		s1.push(30);
		s1.push(80);
		s1.push(100);
		s1.push(25);
		
		while (!s1.isEmpty()) {
			System.out.println(s1.pop());
		}

	}

}
