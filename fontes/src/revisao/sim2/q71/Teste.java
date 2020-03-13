package revisao.sim2.q71;

public class Teste {
	public float parseFloat(String s) {
		float f = 0.0f; // 1
		try {

			f = Float.valueOf(s).floatValue();
//			return f; // 3
		} catch (Exception e) {
			f = Float.NaN; // 4
			return f; // 5
		} finally {
			return f; // 6
		}
//		return f; // 7
	}

}

//remove line 3, 6 	- ok
//remove line 5, 6 	- ok
//Remove line 7		- ok
//Remove line 3, 7 	- ok


