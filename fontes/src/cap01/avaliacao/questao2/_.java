package cap01.avaliacao.questao2;



import static java.lang.System.*;

interface X {
	public static final int x=5;
}
public class _  implements X{

	static String s = "";

	public static void main(String[] __A_V__) {

		for (int i = 0; ++i < __A_V__.length;)
			s+=__A_V__[i];
			out.println(s);
			out.print(x);
	}

}
