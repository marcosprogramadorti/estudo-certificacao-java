package teoria.cap02.p06;

class Animal {

	static public void doStuff() {
		System.out.println("Animal legal");
	}
	private String nome;

	Animal(String nome) {
		this.nome = nome;
	};
	Animal(){
		
	}
}

class Dog extends Animal {
	static public void doStuff() {
		System.out.println("Dog legal");
	}
	Dog(){
		super("legal");
	}

}

public class TestClass {
	public static void main(String[] args) {
		Dog d = new Dog(); 
		d.doStuff();
		
		Animal a = new Dog();
		a.doStuff();
		Animal.doStuff();
	}
}
