package revisao.sim.q33;

class StringWrapper{
	private String theVal;
	public StringWrapper(String theVal) {
		this.theVal = theVal;
	}
	@Override
	public String toString() {
		
		return this.theVal;
	}
	
}
public class TestClass {
	public static void main(String[] args) {
		StringWrapper sw = new StringWrapper("how are you");
		StringBuilder sb = new StringBuilder("how are you?");
		
		System.out.println(sb);
		System.out.println(sw);
		
	}
}
