package revisao.sim2.q01;

public class TestClass {
	private int j;
	void showJ() {
		for ( j = 0; j < 5; j++) {
			System.out.println(j);
		}
	}
	
	public static void main(String[] args) {
		new TestClass().showJ();
	}
}
