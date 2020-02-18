package cap02.avaliacao.questao3;

class Clidder{
	private final void flipper() {
		System.out.println("Clidder.flipper()");
	}
}
public class Clidlet extends Clidder {
	public final void flipper() {
		System.out.println("Clidlet.flipper()");
	}
	
	public static void main(String[] args) {
		new Clidlet().flipper();
	}
}
