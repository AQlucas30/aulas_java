package principal;

import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto produto = new Produto ();
		Scanner sc = new Scanner (System.in);
		
		
		
		System.out.println("Entre com o nome do produto: ");
		produto.setDescricao(sc.nextLine());
		
		System.out.println("Entre com a quantidade a ser adicionada: ");
		produto.adicionaProduto(sc.nextInt());
		
		System.out.println("Entre com o valor unitário: ");
		produto.setPreço(sc.nextDouble());
		
		System.out.println("Quantidade a ser removida: ");
		produto.removerProduto(sc.nextInt());
		
		System.out.println(produto);
		
		sc.close();

	}

}
