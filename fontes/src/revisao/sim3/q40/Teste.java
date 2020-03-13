package revisao.sim3.q40;

public class Teste {
	public static void main(String[] args) {
		Integer i2 = Integer.valueOf(42);
		Long l2 = Long.valueOf(42);
		Double d2 = Double.valueOf(42.0);
		
		i2.longValue();
		l2.longValue();
		d2.longValue();
		
		
		Integer i = new Integer(42);
		Long l = new Long(42);
		Double d = new Double(42.0);
		Byte b = d.byteValue();
		//System.out.println(i == l);
		//System.out.println(l == d);
		System.out.println(i.equals(d));
		System.out.println(d.equals(l));
		System.out.println(l.equals(42));
		System.out.println();
		
		System.out.println(i.equals(42));
		System.out.println(d.equals(42.0));
		System.out.println(l.equals(42l));
		System.out.println(b.equals((byte)42));
		
		
		
		
		
	}
}
