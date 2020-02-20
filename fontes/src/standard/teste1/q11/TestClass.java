package standard.teste1.q11;


public class TestClass{
   public static void main(String args[]){
      int i;
      int j;
//      for (i = 0, j = 0; j < i; ++j, i++){
//         System.out.println(i + " " + j);
//      }
      for (i = 0, j = 0; j < 10; ++j ){
          System.out.println(i++ + " " + ++j);
       }
      System.out.println(i + " " + j);
   }
}
