package standard.teste1.q17;

class TestMetdoOverride{
	
	public int setVar(int a, int b, float c) {
		return 0;
	}

	
	
}
public class TestClass extends TestMetdoOverride {
	
	
	
	public float setVar(int a){return a; } 
	
}
