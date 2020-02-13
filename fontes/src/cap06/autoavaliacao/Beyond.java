package cap06.autoavaliacao;

class Infinity {
	void animailMetodo() {
		System.out.println("Ex Animal metodo");
	}
};

public class Beyond extends Infinity {
	static Integer i;
	
	public static void main(String[] args) {
		//int sw = (int) (Math.random() * 3);
		int sw = 2;
		switch (sw) {
		case 0: {
			for (int x = 10; x > 5; x++)
				if (x > 10000000) {
					x = 10;
					break;
				}
					
		}
		case 1: {
			int y = 7 * i;
			break;
		}
		case 2: {
			Infinity inf = new Beyond();
			inf.animailMetodo();
			Beyond b = (Beyond) inf;
			b.cachorrolMetodo();
			b.animailMetodo();
		}
			break;

		}
	}
	void cachorrolMetodo() {
		System.out.println("Ex Cachorro metodo");
	}

}
