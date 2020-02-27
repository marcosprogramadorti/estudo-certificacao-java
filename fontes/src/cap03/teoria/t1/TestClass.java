package cap03.teoria.t1;

public class TestClass {
	String t;

	void doTest(String t, int v) {
		this.t = t + v;
	}

	public static void main(String[] args) {
		String legal = "Legal = ";

		TestClass tc = new TestClass();
		tc.doTest(legal, 100);
		legal = tc.t;
		int i1 = 123456;
		byte b = (byte)i1;
		System.out.println(legal);
		System.out.println(tc.t);
		System.out.println(b);

	}
}
