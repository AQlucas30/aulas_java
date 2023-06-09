package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List <String> nomes = new ArrayList <> ();
		
		nomes.add("Lucas");
		nomes.add("Maria");
		nomes.add("Paulo");
		nomes.add("Z�");
		
		for (String nome : nomes) {
			System.out.println("Nome; " + nome);
		}
		/*remove os dados da lista
		nomes.remove(2);
		for (String nome : nomes) {
			System.out.println("nome: " + nome);
		}*/
		//obtem o dado dalista por indice (posi��o na memoria)
		System.out.println(nomes.get(3));
		
		String dado = nomes.stream().filter(x -> x == "Lucas").findFirst().orElse (null);
		
		Collections.sort(nomes);
		System.out.println("Imprimindo em ordem alfabetica");
		for (String nome : nomes) {
			System.out.println("Nome1: " + nome);
		}
		
		System.out.println(dado);
	}

}
