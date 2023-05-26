package principal;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual o nome do aluno: ");
		String nome = sc.nextLine();
		
		double [] notas = new double [4];
		double soma = 0;

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Entre com a nota  " + (i + 1) + "  do primeiro bimestre? ");
			notas [i] = sc.nextDouble();
			soma = soma + notas [i];
		}
		
		double media = soma / notas.length;
		
		System.out.println("A média do aluno " + nome + " = " + media);
			
		sc.close();

	}

}
