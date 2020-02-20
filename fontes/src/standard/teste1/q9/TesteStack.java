package standard.teste1.q9;

import java.util.Stack;

public class TesteStack {
	public static void main(String[] args) {
		Stack s1 = new Stack();
		
		s1.push("Legal");
		s1.push(new Long(10));
		s1.push(new TestClass());
		s1.push("OBA");
		System.out.println(s1.peek());
		System.out.println(s1);
		
	}
}
