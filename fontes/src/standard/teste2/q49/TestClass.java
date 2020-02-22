package standard.teste2.q49;

public class TestClass implements I1, I2 {

	@Override
	public void m1() {
		System.out.println("Hello");
		
	}
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		((I1)tc).m1();
	}

}

interface I1 {
	int VALUE = 1;

	void m1();
}

interface I2 {
	int VALUE = 2;

	void m1();
}