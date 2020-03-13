package revisao.sim2.q50;

public class Teste {
	public static void main(String[] args) {
		LAB1: for (int i = 0; i < 10; i++) {
			if (i == 3) {
				continue LAB1;
			}
			System.out.println(i);
		}
	System.out.println();
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				//continue LAB1;
			}
			System.out.println(i);
		}

	}

}
