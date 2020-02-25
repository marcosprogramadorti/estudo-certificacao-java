package tutorial;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDups {
	public static void main(String[] args) {
		//Set<String> palavrasDistintas = Arrays.asList(args).stream().collect(Collectors.toSet());
		//System.out.println(palavrasDistintas.size() + " palavrasDistintas == " + palavrasDistintas);
		
		List<String> teste = new ArrayList<String>();
		Set<String> teste2 = new HashSet<String>();
		
		teste.add("Marcos");
		teste.add("Maria");
		teste.add("Marcos");
		teste.add("Marly");
		teste.add("Marcos");
		
		teste2.add("Marcos");
		teste2.add("Maria");
		teste2.add("Marcos");
		teste2.add("Marly");
		teste2.add("Marcos");
		teste.stream().filter(n -> n.startsWith("Mar")).forEach(j-> System.out.println(j));
		
		 String joined = teste.stream()
				    .map(Object::toString)
				    .collect(Collectors.joining("$$ "));
		 
		 System.out.println(joined);
		 
		System.out.println(teste2.size() + " SET = " + teste2);

	}
}
