package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();

		lista.add("Maria");
		lista.add("João");
		lista.add("Ana");
		lista.add("Breno");
		lista.add("Gustavo");
		lista.add("Arnaldo");
		lista.add("Bob");
		lista.add(2, "Marco");
		lista.remove("Maria");
		
		System.out.println(lista.size());
		for (String item : lista) {
			System.out.println(item);
		}
		
		System.out.println("--------------------");
		
		lista.removeIf(x -> x.charAt(0) == 'M');
		
		System.out.println(lista.size());
		for (String item : lista) {
			System.out.println(item);
		}
		
		System.out.println("---------------------");
		System.out.println("Index of Bob: " + lista.indexOf("Bob"));
		
		System.out.println("---------------------");
		List<String> result = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		System.out.println(result);
		
		System.out.println("---------------------");
		String name = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
