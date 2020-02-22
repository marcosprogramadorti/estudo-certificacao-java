package standard.teste2.q19;

public class TestClass {
	void crazyLoop() {
		int c = 0;
		JACK: while (c < 8) {
			JILL: for (int i = 0; i < 10; i++) {
				System.out.println("");
				
				if (i>3) {
					break JACK;
				} else {
					break JILL;
				}
			}
			System.out.println(c);
			if (c > 3)
				break JACK;
			else
				c++;
		}
	}

	public static void main(String[] args) {

	}
}
