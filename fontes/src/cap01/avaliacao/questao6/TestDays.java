package cap01.avaliacao.questao6;

public class TestDays {
	public enum Days{
		SEG,TERÇA,QUARTA,QUINTA,SEXTA,SÁBADO, DOMINGO;
	}
	public static void main(String[] args) {
		
		for (Days x : Days.values()) {
			System.out.println(x);
		}
		
		Days[] d = Days.values();
		System.out.println(d[3]);
	}
}
