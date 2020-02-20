package standard.teste1.q1;

public class MyClass{
	   public static void main(String args[]){
	      char c;
	      int i;
	      c = 'z';//1
	      i = c;  //2
	      i++;    //3
	      c = (char)i;  //4
	      //c++;    //5
	      System.out.println(++c);
	   }
	}