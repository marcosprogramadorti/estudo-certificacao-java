package cap02.estudos;

class Animal {
	void eatAnimal() {
		System.out.println("Animal.eatAnimal()");
	}
	void doAnimalFaz() {
		System.out.println("Animal.doAnimalFaz()");
	}
	void eat() {
		System.out.println("Animal.eat()");
	}
	
}
class Dog  extends Animal{
	void eatDog() {
		System.out.println("Dog.eatDog()");
	}
	void doDogFaz() {
		System.out.println("Dog.doDogFaz()");
	}
	void eat() {
		System.out.println("Dog.eat()");
	}
}
public class Analise02 {
	public static void main(String[] args) {
		Animal a = new Dog();
		Animal a1 = new Animal();
		//a.eatAnimal();
		a.eat();
		
		Dog d = (Dog) a;
		//Dog d1 = (Dog) a1;
		
		d.eat();
		d.doAnimalFaz();
		d.doDogFaz();
		d.eatAnimal();
		d.eatDog();
		
//		d1.eat();
//		d1.doAnimalFaz();
//		d1.doDogFaz();
//		d1.eatAnimal();
//		d1.eatDog();
		
		
		
	}
}
