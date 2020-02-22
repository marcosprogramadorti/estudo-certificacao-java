package standard.teste2.q71;

public class TestClass {

	public float parseFloat( String s ){
		float f = 0.0f;      // 1
		try {
			f = Float.valueOf(s).floatValue();
			return f;
		} catch (Exception e) {
			  f = Float.NaN ;    // 4
		      return f;     // 5
		}
		finally {
			return f;
		}
		
	}
}
