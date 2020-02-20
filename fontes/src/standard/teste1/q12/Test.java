package standard.teste1.q12;

import standard.teste1.q12.other.*;
class Test{
   public static void main(String[] args){
      String hello = "Hello", lo = "lo";
      System.out.print((standard.teste1.q12.Other.hello == hello) + " ");    //line 1
      System.out.print((standard.teste1.q12.other.Other.hello == hello) + " ");   //line 2
      System.out.print((hello == ("Hel"+"lo")) + " ");           //line 3
      System.out.print((hello == ("Hel"+lo)) + " ");              //line 4
      System.out.println(hello == ("Hel"+lo).intern());          //line 5
      String t = "Hel"+lo;
      System.out.println(t);              //line 4
      System.out.println(hello.equals(t));              //line 4
      System.out.print("teste".intern());              //line 4
   }
}
class Other { static String hello = "Hello"; }