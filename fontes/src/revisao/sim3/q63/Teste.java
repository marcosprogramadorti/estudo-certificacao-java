package revisao.sim3.q63;

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

public class Teste {

	C1 o1;
	C2 o2;
	C3 o3;

	public void m1() {
		o3 = (C3) o1;
		I1 i1 = o3;
		I2 i2 = (I2) i1;
		I1 b = o3;
	}
	

}
