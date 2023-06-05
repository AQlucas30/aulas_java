package principal;

import java.util.Scanner;

import entities.Funcionarios;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		Funcionarios fc = new Funcionarios ();
		
		
		System.out.println("Entre com o nome: ");
		fc.nome = sc.nextLine();
		
		System.out.println("Entre com o cargo: " );
		fc.cargo = sc.nextLine();
		
		System.out.println("Entre com o salário: ");
		fc.salario = sc.nextDouble();
		
		System.out.println("Salario: ");
		fc.verificarComissao();

		
		
		
		
		sc.close();
		

	}

}
