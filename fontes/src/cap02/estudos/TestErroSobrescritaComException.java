package cap02.estudos;

class Foo{
	void doStuff() {
		System.out.println("Foo.doStuff()");
	}
}
class FooFilho extends Foo{
	
	void doStuff(String a) throws Exception {
		System.out.println("FooFilho.doStuff()");
	}
}
public class TestErroSobrescritaComException {	
	
	public static void main(String[] args) {
		Foo f = new Foo();
		FooFilho ff = new FooFilho();
		
		Foo f1 = new Foo();
		Foo ff1 = new FooFilho();
		
//		f.doStuff();
//		ff.doStuff();
		
		f1.doStuff();
		ff1.doStuff();
	}
}
