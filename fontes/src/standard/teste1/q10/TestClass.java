package standard.teste1.q10;

public class TestClass {
	//String s;
	//String s = 'asdf';
	//String s = 'a';
	
	String s = this.toString().strip();
	//
	
	public static void main(String[] args) {
		new TestClass().go();
	}
	
	void go() {
		System.out.println(s);
	}
}
