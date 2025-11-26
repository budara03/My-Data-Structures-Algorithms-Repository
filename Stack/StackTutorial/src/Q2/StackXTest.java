package Q2;

public class StackXTest {

	public static void main(String[] args) {
	stack s = new stack(5);

		s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Is stack empty? " + s.isEmpty()); // false
        System.out.println("Is stack full? " + s.isFull());   // false
        System.out.println("Number of items in stack: " + s.getCount()); // 3

        s.pop();
        System.out.println("After one pop, count: " + s.getCount()); // 2
	}

}
