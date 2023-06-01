package principal;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Pessoa pessoa = new Pessoa ();
		
		
		System.out.println(" Nome: ");
		pessoa.nome = sc.next();
		System.out.println("Ano do nascimento: ");
		int ano = sc.nextInt();
		System.out.println("Sexo: ");
		pessoa.sexo = sc.next();charAt(0);
		
		//pessoa.retornarIdade(ano);
		
		
	
		
		System.out.println("Nome: " + pessoa.nome );
		System.out.println("Idade: " + pessoa.idade);
		System.out.println("Sexo: " + pessoa.sexo);
		
		sc.close();
	}

	private static void charAt(int i) {
		// TODO Auto-generated method stub
		
	}

}
