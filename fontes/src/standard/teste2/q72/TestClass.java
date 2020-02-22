package standard.teste2.q72;

public class TestClass {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.ensureCapacity(100);
		
		StringBuilder sb2 = new StringBuilder(100);
		
		System.out.println("aqui: "+sb.capacity() + "  " + sb2.capacity());
	}
}
