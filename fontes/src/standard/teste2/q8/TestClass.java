package standard.teste2.q8;

public class TestClass {
	public static void main(String[] args) {
		int i = 0 ;
		int[] iA = {10, 20} ;
		iA[i] = i = iA[1] = i = 30;
		System.out.println(""+ iA[ 0 ] + " " + iA[ 1 ] + "  "+i) ;
	}
}
