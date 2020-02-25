package teoria.cap02.p05;

interface Pula {
	
}
class Animal {
	
}
class Dog extends Animal{
	
}
class Macaco extends Animal implements Pula{
	
}

public class TestClass {
	Animal fazTeste(){
		return new Dog();
	}
	Animal fazTeste2(){
		return new Macaco();
	}
	Pula fazTeste3() {
		return new Macaco();
	}
	int fazTeste4() {
		char a = 'a';
		return a;
	}
	int fazTeste5() {
		byte b = -128;
		return b;
	}
	long fazTeste6() {
		int i = 10;
		return i;
	}
}
