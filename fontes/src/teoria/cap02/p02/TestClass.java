package teoria.cap02.p02;

class Animal {
	public void comer() throws Exception{
		System.out.println("Animal pode comer");
	}
}
class Dog extends Animal {
	@Override
	public void comer() {
		System.out.println("Dog pode comer");
	}
}
public class TestClass {
public static void main(String[] args) throws Exception  {
	Animal a = new Dog();
	Dog d = new Dog();
	
	d.comer();
	a.comer();
}
}
