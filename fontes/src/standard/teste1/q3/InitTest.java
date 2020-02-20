package standard.teste1.q3;


public class InitTest{
   static {s1 = sM1("20"); }
   public InitTest(){
      s1 = sM1("1");
   }
   static String s1 = sM1("a");
   String s3 = sM1("2");
   String s6 = sM1("60");
   {
      s1 = sM1("3");
   }
   String s5 = sM1("10");
   static{
      s1 = sM1("b");
   }
   static String s2 = sM1("c");
   String s4 = sM1("4");
    public static void main(String args[]){
        InitTest it = new InitTest();
    }
    private static String sM1(String s){
       System.out.println(s);  return s;
    }
}
	