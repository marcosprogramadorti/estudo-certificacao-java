package cap02.estudos;

class Alpha{
	Alpha goToAlpha(Alpha a) {
		System.out.println("Alpha.goToAlpha()");
		return a;
	}
	void Alpha() {
		
	}
}
class Beta extends Alpha{
	
	Beta goToAlpha(Alpha a) {
		Beta b = new Beta();
		System.out.println("Beta.goToAlpha()");
		b.Alpha();
		return b;
	}
	
	Alpha goTeste() {
		Beta a = new Beta();
		return a;
	}
}
class Foo2 {
	void go() {
		System.out.println("Foo.go()");
	}
	
	int goTest() {
		System.out.println("Foo.go()");
		short r = 3;
		return r;
	}
	
}
class Bar extends Foo {
	
	String go(String a) {
		System.out.println("Bar.go()");
		return a;
	}
}

public class Analise03 {
	
	public static void main(String[] args) {
		Beta b1 = new Beta();
		b1.goToAlpha(null);
		
	}

}
