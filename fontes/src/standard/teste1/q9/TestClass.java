package standard.teste1.q9;

import java.util.*;
public class TestClass{
   public static void main(String args[]){
      Stack s1 = new Stack ();
      Stack s2 = new Stack ();
      processStacks (s1,s2);
      System.out.println (s1 + "    "+ s2);
      new TestClass().processStacksObj(s1, s2);
      
   }
   public static void processStacks(Stack x1, Stack x2){
      x1.push (new Integer ("100")); //assume that the method push adds the passed object to the stack.
      x2 = x1;
   }
   public  void processStacksObj(Stack x1, Stack x2){
	      x1.push (new Integer ("100")); //assume that the method push adds the passed object to the stack.
	      x2 = x1;
	      System.out.println (x1 + "    "+ x2);
   }
 }