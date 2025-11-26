package stringBuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer ("ABCD");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder builder = new StringBuilder();
		
		for(int i=0 ;i<5;i++) {
			builder.append(" abc ");
		}
		
		System.out.println(builder);
		
   StringBuilder buildeR = new StringBuilder();
		
		for(int i=0 ;i<5;i++) {
			buildeR.insert(2,"xyz");
		}
		
		System.out.println(buildeR);

	}

}
