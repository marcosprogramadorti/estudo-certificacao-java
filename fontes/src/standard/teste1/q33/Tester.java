package standard.teste1.q33;

class StringWrapper {
	public String theVal;

	public StringWrapper(String str) {
		this.theVal = str;
	}
}

public class Tester {
	public static void main(String[] args) {
		StringWrapper sw = new StringWrapper("How are you?");
		StringBuilder sb = new StringBuilder("How are you?");
		StringBuilder sb2 = new StringBuilder("How are you?");
		StringBuffer sb3 = new StringBuffer("How are you?");
		
		System.out.println("Hello, " + sw);
		System.out.println("Hello, " + sw.theVal);
		System.out.println("Hello, " + sb);
		System.out.println( sb2);
		System.out.println( sb2.toString());
		System.out.println(" --------------- ");
		System.out.println( sb3);
		System.out.println( sb3.toString());
	}
}