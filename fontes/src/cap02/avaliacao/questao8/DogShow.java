package cap02.avaliacao.questao8;

class Dog {
	public void bark() {
		System.out.println("woof ");
	}
}
class Hound extends Dog {
	public void bark() {
		System.out.println("how1 ");
	}
	public void sniff() {
		System.out.println("sniff ");
	}
}
public class DogShow {
	public static void main(String[] args) {
		new DogShow().go();
	}
	
	void go() {
		
		((Dog) new Hound()).bark();
		((Hound) new Hound()).sniff();
		((Hound) new Dog()).bark();
	}
}
