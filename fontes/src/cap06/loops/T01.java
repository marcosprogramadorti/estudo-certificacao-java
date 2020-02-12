package cap06.loops;

public class T01 {

	public static void main(String[] args) {
		//ex01Loop();
		//testeEscopo(args);
		//doTeteSaida();
		//seraQueImprime();
		//testeSaidaForcadaBreak();
		//forViraWhile();
		//variasVariaveisNoFor();
		//variasVariaveisNoFor2();
		//testeEscopo2();
		//testeExpressao();
		forAprimoradosValidos();
	}
	
	private static void forAprimoradosValidos() {
		int x;
		long x2;
		long[] la = {7l,8L,9l};
		int[][] twoDee = {{1,2,3},{4,5,6}, {7,8,9}};
		String[] sNums ={"one", "two","three"};
		Animal[] animais = {new Dog(), new Cat()};
		
		for (long y : la) {
			System.out.println("long y : la = > " + y);
		};
		for (int[] n : twoDee) {
			System.out.println("int[] n : twoDee > " + n[1]);
		};
		for (int n : twoDee[2]) {
			System.out.println("int n : twoDee[2] > " + n);
		};
		for (String s : sNums) {
			System.out.println("String s : sNums > " + s);
		}
		for (Animal a : animais) {
			System.out.println("Animal a : animais > " + a.getName());
		}
		for (Object o : sNums) {
			System.out.println("Object o : sNums > " + o);
		}
		
		for (Object o : animais) {
			System.out.println("Object o : animais > " + o.toString());
		
		}
		
		//for (long x2 : la) {} //; x2 ja foi declarado.
		//for (int x3 :twoDee ) {}; // nao dá para enfiar um array em um int;
		//for (int x3 : la) {}; // nao da para enfiar um long em um int;
		//for (Dog d:  animais); // voce pode obter um cat;
		
	}
	
	private static void testeExpressao() {
		int x = 3;
		for (int a = 1 ; x < 10 ;  System.out.println("imprime aqui na expressao do for" + " x " + x + " a " + a)) {
			System.out.println("valor de x: " +  x);
			x = x + a;
		}
		System.out.println("valor de x fora do loop: " +  x);
	}
	
	private static void testeEscopo2() {
		int x = 3;
		for (x = 5 ; x < 10 ;  x++) {
			System.out.println("valor de x: " +  x);
		}
		System.out.println("valor de x fora do loop: " +  x);
	}
	
	private static void variasVariaveisNoFor() {
		for (int a=0,b=0,c=0,d=0; d < 10 ; a++,b++,c++,d++) {
			System.out.println(a +" "+ b+" "+ c+ " "+ d + " ");
		}
	}
	private static void variasVariaveisNoFor2() {
		for (int a = 0,b = 0,c = 0,d=0; d < 10 ;d++) {
			System.out.println(a +" "+ b+" "+ c+ " "+ d + " ");
		}
	}

	private static void seraQueImprime() {
		for (; ;) {
			System.out.println("será que imprime ???");
		}
	}
	private static void forViraWhile() {
		int i = 0;
		for (; i<4 ;) {
			System.out.println("i eh: " + i);
			i++;
		}
	}

	private static void doTeteSaida() {
		if (testeSaidaForcada()) {
			System.out.println("deu true");
		}else {
			System.out.println("deu fslse");
		}
	}

	private static boolean testeSaidaForcadaBreak() {
		for (int i = 0; i < 4; i++) {
			System.out.println(i);
			if (i== 2) {
				break;
			}
		}
		return false;
	}
	private static boolean testeSaidaForcada() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			//System.exit(0);
			//return true;
			break;
		}
		return false;
	}

	private static void testeEscopo(String[] args) {
		for (long i = 0, j=3; i < args.length; i++) {
			
		}
		System.out.println("i está fora do escop");
	}
	
	

	private static void ex01Loop() {
		boolean x = false;
		do {
			System.out.println("ao meno uma vez será executado");
		} while(false);
		
		
		while (x) {
			System.out.println("nunca será executado");
		}
	}

}
