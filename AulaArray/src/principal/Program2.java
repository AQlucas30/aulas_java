package principal;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		
		String nome;
		double pb;
		double sb;
		double tb;
		double qb;
		
		
		System.out.println("Qual o nome do aluno: ");
		nome = sc.nextLine();
		
		double [] notas = new double [4];
		
		for (int i = 0; i <10; i++) {
	
		System.out.println("Qual a nota do primeiro bimestre? " + ( + i));
		pb = sc.nextDouble();
		}
		System.out.println("Qual a nota do segundo bimestre? ");
		sb = sc.nextDouble();
		
		System.out.println("Qual a nota do terceiro bimestre? ");
		tb = sc.nextDouble();
		
		System.out.println("Qual a nota do quarto bimestre? ");
		qb = sc.nextDouble();
		
		
		double media = pb + sb + tb + qb / 4; 
		
		System.out.println("A média do aluno foi " + media);
		
		
		
		
		
		
		
		
		sc.close();

	}

}
