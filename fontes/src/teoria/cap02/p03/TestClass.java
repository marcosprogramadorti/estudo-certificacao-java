package teoria.cap02.p03;

interface Pet{
	void manso(); 
}
class Animal implements Pet{
	void fazBarrulho() {
		System.out.println("Animal Generico");
	}

	@Override
	public void manso() {
		System.out.println("Animal manso");
		
	};
	
	
}
class Dog extends Animal implements Pet {
	@Override
	void fazBarrulho() {
		System.out.println("Latido");
	}
	void fingeDeMorto() {
		System.out.println("finge de morto");
	}
	
}
public class TestClass {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		Dog d2 = new Dog();
		
		d2.manso();
		
	//	String s = (Dog) a1;
		Animal[] animais = {new Dog(), new Animal(),  new Animal(),new Dog() };
		for (Animal animal : animais) {
			animal.fazBarrulho();
			if (animal instanceof Dog) {
				Dog d = (Dog) animal;
				d.fingeDeMorto();
			}
		}
	}
}
