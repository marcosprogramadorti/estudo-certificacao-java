package revisao.sim2.q27;

public class Teste {
	public static int mx(int s) {
			for (int i = 0; i < 3; i++) {
				s = s + i;
			}
			return s;
	}
	public static void main(String[] args) {
		int a = 8;
		
		a+= a + 3 + a++ + mx(a) ;
		System.out.println(a);
		a=8;
		a+= a + 3 +  mx(a) + a++;
		System.out.println(a);

	}
}
