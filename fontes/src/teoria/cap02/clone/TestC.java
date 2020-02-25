package teoria.cap02.clone;

class A{
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}
	
	int size;
	int altura;
	int largura;
}
public class TestC {
		public static void main(String[] args)  {
			A a = new A();
			a.size = 10;
			a.altura = 9;
			a.largura=8;
			
			Object a2 = null;
			try {
				a2 = a.clone();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			A a3 = (A) a2;
			System.out.println("altura: " + a3.altura+ " size " + a3.size   );
		}
}
