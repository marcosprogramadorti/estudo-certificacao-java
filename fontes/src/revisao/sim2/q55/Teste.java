package revisao.sim2.q55;

class A {
	int i;

	public A(int i) {
		this.i = i;
	}
//	public A(){
//		
//	}

}

class B extends A {
	int j;

	public B(int i, int j) {
		super(i);
		this.j = j;
	}
// 1 - nao pode - a class nao tem um construtor sem parametro	 
//	 public B() {
//		 
//	 }
// 2 - nao pode - nao tem invocacao do super : como super(y);	 
//	 B(int y ) {   j = y; }

// 3 - nao pode -  tem invocacao do super mas o super nao esta como primeiro comando(deve ser sempre o primeiro);	 
//	 B(int y ) {   j = y; super(y)}	 

// 4 - ok- chama o super existente - e eh o primeiro comando.
//	 B(int y ) { super(y*2 ); j = y; }

// 5 - nao chama o super	 
//	 B(int y ) { i = y; j = y*2; };

// 6 - ok - o this chama um construtor exitem na class B.
	B(int z) {
		this(z, z);
	}

}

public class Teste {

}
