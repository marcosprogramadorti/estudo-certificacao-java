package standard.teste1.q61;

public class CastTest{
	   public static void main(String args[ ] ){
		  byte max = Byte.MAX_VALUE;
		  byte min = Byte.MIN_VALUE;
		  
	      byte b = -128 ;
	      int i = b ;
	      b = (byte) i;
	      System.out.println(i+" "+b);
	      System.out.println("de " + min + " até " + max);
	      
	   }
	}