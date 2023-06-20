package principal;

import java.util.Scanner;

import entities.Livro;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual o nome do Livro? ");
		String nome = sc.nextLine();
		
		System.out.println("Qual o nome do edicao?");
		String edicao = sc.nextLine();
		
		System.out.println("Qual o valor?");
		double valor = sc.nextDouble();
		
		
		System.out.println();
		
		
		Livro livro = new Livro (nome, edicao, valor);
		
		livro.setValor(valor);
		
		System.out.println(livro);
		sc.close();

	}

}
