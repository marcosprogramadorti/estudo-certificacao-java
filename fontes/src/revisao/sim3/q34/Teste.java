package revisao.sim3.q34;

public class Teste {

	/* ok */
	public Teste(int a, int b) {
		
	}
	/* nao é construtor - construtor nao tem retorno*/
	public void Teste(int a) {
		
	}
	
	/* ok - nao tem problema um contrutor ser privado*/
	private Teste(String a, int b) {
		
	}
	/* ok */
	public Teste(String a, String b) {
		
	}
	
	/* nao ok - nao tem corpo, portanto é abstrato - nenhum construtor pode ser abastrato*/
	//public Teste(String s);
	
}
