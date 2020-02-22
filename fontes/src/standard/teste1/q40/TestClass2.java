package standard.teste1.q40;

class Animal {
	void som() {
		System.out.println("som generico");
	}
}

class Dog extends Animal {
	void som() {
		System.out.println("Latido");
	}
}

public class TestClass2 {
	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		
		a = d;
		d = (Dog) a;
		a.som();
		d.som();
		System.out.println("fim");
	}
}
