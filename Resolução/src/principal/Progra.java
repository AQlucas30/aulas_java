package principal;

import java.util.Scanner;

public class Progra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		double num1;
		double num2;
		double num3;
		
		System.out.println("Entre com o primeiro numero: ");
		num1 = sc.nextDouble ();
		
		System.out.println("Entre com o segundo numero: ");
		num2 = sc.nextDouble ();
		
		System.out.println("Entre com o terceiro numero");
		num3 = sc.nextDouble();
		
		if (num1 > num2 && num1 > num3) {
		    System.out.println("O maior numero é: " + num1);

		}		
		
		if (num2 > num3 && num2 > num1) {
		    System.out.println("O maior numero é: " + num2);

		}
		
		if (num3 > num2 && num3 > num1) {
			System.out.println("O maior numero é: " + num3);
			
		}
		
		else if (num2 > num3) {
			System.out.println("O maior numero é: " + num2);
		}
		
		else 
			System.out.println("O maior numero é: " + num3);
		sc.close();

	}

}
