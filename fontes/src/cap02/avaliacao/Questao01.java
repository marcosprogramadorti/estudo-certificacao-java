package cap02.avaliacao;

abstract interface Frobnicate{
	public void twiddle(String s) ;
}
//abstract class Frob implements Frobnicate{
//	public  void twiddle(String s) {
//		System.out.println("Frob.twiddle()");
//	};
//}

//abstract class Frob implements Frobnicate{
//	
//}

//class Frob extends Frobnicate{
//	public  void twiddle(int s) {
//		System.out.println("Frob.twiddle()");
//	};
//}

//class Frob implements Frobnicate{
//	public  void twiddle(int s) {
//		System.out.println("Frob.twiddle()");
//	};
//}

class Frob implements Frobnicate{
	public  void twiddle(String s) {
		System.out.println("Frob.twiddle()");
	};
	public  void twiddle(int s) {
		System.out.println("Frob.twiddle()");
	};
	
	public  String twiddle(int s, int a) {
		System.out.println("Frob.twiddle()");
		return "a";
	};
}
public class Questao01 {

}
