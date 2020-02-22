package standard.teste2.q13;

public class TestClass {
	public int transformNumber(int n) {
		int radix = 2;
		int output = 0;
		output += radix * n;
		radix = output / radix;
		if (output < 14) {
			return output;
		} else {
			output = output * radix / 2;
			return output;
		}
		
	}
}
