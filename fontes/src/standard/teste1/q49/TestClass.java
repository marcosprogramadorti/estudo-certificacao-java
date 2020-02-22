package standard.teste1.q49;

public class TestClass{
	public static void main(String args []){
		String s = "MARCOS";
		//System.out.println(s.substring(4, 7)); //1
		//System.out.println(s.substring(5)); //2
		//System.out.println(s.substring(s.indexOf('I', 3))); //3
		//System.out.println(s.substring(s.indexOf('I', 4))); //4}}
		
		System.out.println("RCO - " + s.subSequence(2, 6));
		System.out.println("RCO - " + s.substring(2));
	}
}
