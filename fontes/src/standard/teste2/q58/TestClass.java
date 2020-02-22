package standard.teste2.q58;

class TestClass {
	public static void main(String[] args) {
		teste: {
			System.out.println("aqui");
			System.out.println("aqui 2");
			for (int i = 0; i < 3; i++) {
				System.out.println(" i = " + i);
				if (i == 1)
					break teste;
			}
		}

	}

}