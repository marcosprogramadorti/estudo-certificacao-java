package revisao.sim2.q63;

interface I1 {

}

interface I2 {

}

class C1 implements I1 {

}

class C2 implements I2 {

}

class C3 extends C1 implements I2 {

}
class C4 extends C3  implements I1, I2{
	
}
public class Teste {
	C1 o1;
	C2 o2;
	C3 o3;
	C4 o4;
	void Tes() {
		
		o3 = (C3) o1;
//		o3 = o2; 		// type mismatch: cannot convert from C2 to C3
//		o3 = (c3)o2; 	// type mismatch: cannot convert from C2 to C3
		I1 i1 = o3; 
		I2 i2 = (I2) i1;
		I1 b = o3;
	}
	
	public static void main(String[] args) {
		float f = 43e3f;
		long l = (long) 20e3;
		System.out.println(f);
		System.out.println(l);
		
	}
}
