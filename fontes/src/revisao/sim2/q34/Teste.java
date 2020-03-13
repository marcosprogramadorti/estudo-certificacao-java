package revisao.sim2.q34;

public class Teste {
	public Teste() {}; //ok
	public Teste(int a, int b) {}//ok
	public void Teste(int a) {} // Constructors cannot return anything. Not even void.
	//public Teste(int b); // Constructors cannot have empty bodies (i.e. they cannot be abstract)
	private Teste(String a) {}//You can apply public, private, protected to a constructor. But not static, final, synchronized, native and abstract. 
	public Teste(String s1, String s2) { }; // 	O compilador ignora o ponto e vírgula extra.
	
	
	
}
