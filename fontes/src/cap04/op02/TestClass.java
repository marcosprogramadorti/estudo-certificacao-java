package cap04.op02;

public class TestClass {
	public static void main(String[] args) {
		int a = 12;
		int b= 5;
		int c = a/b;
		int d = a%b;
		int e = a^b;
		System.out.println("c = 2 = " + c);
		System.out.println("d = 2 = " + d);
		System.out.println("e = 37500 = " + e);
		String s = "String";
		System.out.println(s + a + b);
		System.out.println(s + (a + b));
		
		String s2 = "123";
		s2+=45;
		s2+=67;
		s2+=89;
		System.out.println(s2);
		
	}
}
