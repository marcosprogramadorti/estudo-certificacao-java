package revisao.sim3.q53;

class A {
	A(String a){
		
	}
	A(String a, int b){
		
	}
}
class B extends A{
	int theValue = 0;
	B(String s, int b){
		super(s,b); // obrigatoriamente tem que vim em primeiro lugar.
		this.theValue = b;
	}
	B(){
		this("A", 0);
	}
	
}
public class Teste {

}
