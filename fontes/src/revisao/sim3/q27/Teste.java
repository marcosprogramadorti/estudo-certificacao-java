package revisao.sim3.q27;

public class Teste {
	public static int mx(int s) {
		for (int i = 0; i < 3; i++) {
			s = s + i;
		}
		return s;

	}

	public static void main(String[] args) {
		int s = 5;
		s+=s + mx(s) + ++s;
		/*
		 * s = s + s + mx(s) + ++s
		 * s = 5 + 5 + mx(5) + (5+1)
		 * s = 5 + 5 + 8 + 6
		 * s = 24
		 * */
		System.out.println("S = " + s);
		System.out.println();
		System.out.println("-----------------");
		s=5; 
		s+=s + ++s + mx(s);
		/*
		 * s = s + s + (5+1) + mx(6)
		 * s = 5 + 5 + 6 + 9
		 * s = 25
		 * * */
		System.out.println("S = " + s);
		
	}
}
