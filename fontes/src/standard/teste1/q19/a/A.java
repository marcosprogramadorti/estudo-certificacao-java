package standard.teste1.q19.a;

//In file A.java package a; 
public class A{
	public A(){ }
	public void print(){ System.out.println("A"); } 
}  
//In file B.java package b; import a.*; public class B extends A{    B(){ }    public void  print(){ System.out.println("B"); }    public static void main(String[] args){       new B();    } }
