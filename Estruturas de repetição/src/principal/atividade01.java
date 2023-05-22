package principal;

import java.util.Scanner;

public class atividade01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		double somaAltura = 0;		
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite a altura da pessoa " + i + "(em metros)");
			double altura = sc.nextDouble();
			somaAltura += altura;
		}
		double mediaAltura = somaAltura / 5;
		System.out.println("A média de altura das pessoas é: " + mediaAltura + " metros ");
		
		
		
		
		sc.close();

	}

}
