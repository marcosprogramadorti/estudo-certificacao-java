package cap03.q09;

class Animal {
	
}
class Mamifero extends Animal{
	
}
class Dog extends Mamifero{
	
}
class Nada{
	
}
public class TestClass {
	public static void main(String[] args) {
		Nada n = new Nada(); 
		Dog d1 =new Dog();
		Mamifero m1 = d1;
		Animal a1 = d1;
		a1 = m1;
		
		d1 = (Dog)a1;
	//	d1 = (Dog)m1;
		//d1 = (Dog)n;
	}
}
