package revisao.sim3.q56;

class Ziba{
	@Override
	public String toString() {
		
		return "ziba";
	}
}
class A{
	int i = 10;
	Ziba z;
	A(){
		print();
	}
	
	public void print() {
		System.out.println("A.print() - " + z);
		System.out.println("A.print() - " + i);
	}
}
class B extends A{
	Ziba z;
	B(){
		print();
	}
	int i = 4;
	@Override
	public void print() {
		System.out.println("B.print() - " + z);
		System.out.println("B.print() - " + i);
	}
}
public class Teste {
	public static void main(String[] args) {
//		A a2 = new A();
//		A a = new B();
		B b = new B();
//		b.print();
		
		
//		System.out.println();
//		System.out.println("---");
//		a.print();
//		b.print();
//		a2.print();
		
		
		
	}
}
