package revisao.sim3.q73;

public class Teste {
	public static void main(String[] args) {
		int a = 5, b=7, k=0;
		Integer m = null;
		k = new Integer(a) + new Integer(b);//1
		System.out.println(k);
		k = new Integer(a) + b;
		m = new Integer(a) + 100;
		System.out.println(k);
	}
}
