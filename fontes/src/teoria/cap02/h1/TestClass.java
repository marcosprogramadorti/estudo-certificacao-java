package teoria.cap02.h1;

class TarifaBasica {
	float valor = 10.0f;

	void tarifa() {
		System.out.println(valor);
	}
}

class Fixo extends TarifaBasica {

}

class Movel extends TarifaBasica {

}

public class TestClass {
	public static void main(String[] args) {
		Fixo f = new Fixo();
		Movel m = new Movel();

		mostaTarifaBasica(f);
		mostaTarifaBasica(m);

	}

	public static void mostaTarifaBasica(TarifaBasica b) {
		b.tarifa();
	}
}
