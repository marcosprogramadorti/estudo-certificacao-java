package revisao.sim3.q72;

public class Teste {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(100);
		System.out.println(sb.capacity());
		sb.ensureCapacity(200); 
		System.out.println(sb.capacity());
	}
}
