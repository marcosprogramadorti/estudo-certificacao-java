package cap01.avaliacao.questao10;

interface Gadget{
	void doStuff();
}
abstract class  Electronic{
	void getPower() {
		System.out.println("plug in");
	}
}
public class Tablet extends Electronic implements Gadget{

	@Override
	public
	void doStuff() {
		System.out.println("show Book ");
		
	}
	
	public static void main(String[] args) {
		new Tablet().getPower();
		new Tablet().doStuff();
	}

}
