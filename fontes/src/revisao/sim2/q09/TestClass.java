package revisao.sim2.q09;

public class TestClass {
	void m1(int t) {
		System.out.println("int");
	}

	void m1(double t) {
		System.out.println("double");
	}
	void m1(float t) {
		System.out.println("float");
	}

	void m1(String t) {
		System.out.println("String");
	}

	public static void main(String[] args) {
		TestClass t = new TestClass();
		t.m1(15.0f);

	}
}
