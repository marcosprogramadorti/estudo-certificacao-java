package standard.teste2.q18;

public class TestClass {
	
	void probe(Integer i) {
		System.out.println("Integer i");
	}
//	void probe (Object o) {
//		System.out.println("Object o");
//	}
	
	void probe (String s) {
		System.out.println("String s");
	}
	void probe (Long o) {
		System.out.println("Long o");
	}
	
	public static void main(String[] args) {
		String a = "hello";
		int i = 3; 
		long l = 5;
		Object o = new Object();
		Object o2 = i;
		new TestClass().probe((long)o2);
	}
	

}
