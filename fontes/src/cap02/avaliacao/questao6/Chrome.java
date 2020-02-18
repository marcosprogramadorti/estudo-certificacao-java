package cap02.avaliacao.questao6;

class X {
	void do1() {
		System.out.println("X.do1()");
	}
}
class Y extends X{
	void do2() {
		System.out.println("Y.do2()");
	}
}
public class Chrome {
	public static void main(String[] args) {
		X x1 = new X();
		X x2 = new Y();
		Y y1 = new Y();
		
		//(Y)x2.do2();
		//x2.do2();
		((Y)x2).do2();
		
	}
}
