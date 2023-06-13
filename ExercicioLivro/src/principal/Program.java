package principal;

import java.util.Scanner;

import entities.Livro;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual o nome do Livro? ");
		String nome = sc.nextLine();
		
		System.out.println("Qual o nome do titulo?");
		String titulo = sc.nextLine();
		
		System.out.println("Qual o valor?");
		double valor = sc.nextDouble();
		
		
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		Livro livro = new Livro (nome, titulo, valor);
		
		livro.setValor(valor);
		
		System.out.println(livro);
		sc.close();

	}

}
