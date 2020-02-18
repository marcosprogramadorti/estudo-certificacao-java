package cap02.avaliacao.questao13;


class Mamifero{
	String name = " furry";
	String makeNoise() {
		return "generic noise";
	}
}
class Zebra extends Mamifero {
	String nome = "stripes ";
	String makeNoise() {
		return "bray";
	}
	
	
}
public class Zoo {
	
	public static void main(String[] args) {
		new Zoo().go();
	}
	void go() {
		Mamifero m = new Zebra();
		System.out.println(m.name + " " + m.makeNoise());
	}
}
