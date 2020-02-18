package cap02.avaliacao.questao5;

class Bird {
	
	{System.out.println("Bird.enclosing_method()");}
	public Bird() {
		System.out.println("Bird.Bird()");
	}
	static {System.out.println("static Bird.enclosing_method()");}
}
class Raptor extends Bird {
	public Raptor() {
		System.out.println("Raptor.Raptor()");
	}
	{System.out.println("Raptor.enclosing_method()");}
	static {System.out.println("statict Raptor.enclosing_method()");}
}
public class Hawk extends Raptor {
	public static void main(String[] args) {
		System.out.println("Hawk.main() - pre");
		new Hawk();
		System.out.println("Hawk.main() - end");
	}
}
