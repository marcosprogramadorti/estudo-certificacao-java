package cap01.avaliacao.questao5.pkgB;

import cap01.avaliacao.questao5.pkgA.*;

public class Baz extends Foo{
	public static void main(String[] args) {
		Foo f = new Foo();
		//System.out.println(" " + f.a);
		//System.out.println(" " + f.b);
		//System.out.println("" + f.);
		System.out.println(" " + f.c);
		new Baz().go();
	}
	
	void go () {
		int t = b=3;
		System.out.println(t);
	}
	
}	
