package standard.teste2.q38;

public class TestClass {

	public static void stringTest(String s) {
		s.replace('h', 's');
	}

	public static void stringBuilderTest(StringBuilder s) {
		s.append("o");
		s.insert(1, "marcos");
	}

	public static void main(String[] args) {
		String s = "hell";
		StringBuilder sb = new StringBuilder("well");
		stringTest(s);
		stringBuilderTest(sb);
		System.out.println(s + sb);
	}

}
