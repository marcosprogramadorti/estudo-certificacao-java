package revisao.sim2.q43;

// Boolean - The type Teste cannot subclass the final class Boolean
// System - The type Teste cannot subclass the final class System 
// String - The type Teste cannot subclass the final class String
// Number -  ok - public class Teste extends Number
// StringBuilder - The type Teste cannot subclass the final class StringBuilder

/**
 * String, StringBuilder, and StringBuffer - all are final classes.  
 * 1. Remember that wrapper classes for primitives (java.lang.Boolean, java.lang.Integer, java.lang.Long, java.lang.Short etc.) are also final 
 * and so they cannot be extended.  
 * 
 * 2. java.lang.Number, however, is not final. Integer, Long, Double etc. extend Number.  
 * 
 * 3. java.lang.System is final as well.
 * **/
public class Teste extends Number{

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

}
