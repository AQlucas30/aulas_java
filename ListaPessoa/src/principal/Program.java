package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static <Pessoal> void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		Pessoa pessoa;
		List <Pessoa> pessoas = new ArrayList <>();
		char opcao;
		
		do {
			pessoa = new Pessoa();
			
			System.out.println("Entre com o nome: ");
			pessoa.setNome(sc.nextLine());
			
			System.out.println("Entre Com o telefone: ");
			pessoa.setTelefone1(sc.nextLine());
			
			System.out.println("entre com a Idade: ");
			pessoa.setIdade(sc.nextInt());
			
			pessoas.add(pessoa);
			System.out.print("Deseja cadastrar mais alguma pessoa? ");
			System.out.println("s/n");
			opcao = sc.next().charAt(0);
			sc.nextLine();
			
		}while(Character.toLowerCase(opcao) == 's');
		
		for (Pessoa p : pessoas) {
			System.out.println(p);
		}
		
sc.close();
	}

}
