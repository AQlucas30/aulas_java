package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int num1;
		int num2;
		int num3;
		
		/*System.out.println("Entre com o primeiro numero: ");
		num1 = sc.nextInt();
			
		System.out.println("Entre com o segundo numero: ");
		num2 = sc.nextInt();
	
		System.out.println("Entre com o terceiro numero: ");
		num3 = sc.nextInt();
		
		/*if (num1 > num2 && num1 > num3) {
			System.out.println("O maior numero �: " + num1);
		}
		
		if (num2 > num3 && num2 > num1) {
			System.out.println("O maior numero �: " + num2);
		}
		
		if (num3 > num2 && num3 > num1) {
			System.out.println("O maior numero �: " + num3);
		}*/
		
		/* if (num1 > num2 && num1 > num3) {
			System.out.println("O maior numero �: " + num1);
		}
		
		else if (num2 > num3) {
			System.out.println("O maior numeri �: " + num2);
		}
		
		else {
			System.out.println("O maior numero �: " + num3);
		} */
		
		
		/* int ano;
		
		System.out.println("Entre com o ano para saber se � bissecto");
		ano = sc.nextInt();
		
		if (ano % 4 == 0 && ano % 100 != 0 ) {
			System.out.println("� um ano bissext");
		}
		else if (ano % 400 == 0) {
			
		}
		else {
			System.out.println("O ano n�o � bissexto!");
		}*/
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;
		
		System.out.print("Entre com a primeira nota ");
		nota1 = sc.nextDouble();

		System.out.print("Entre com a segunda nota ");
		nota2 = sc.nextDouble();

		System.out.print("Entre com a terceira nota ");
		nota3 = sc.nextDouble();

		System.out.print("Entre com a quarta nota ");
		nota4 = sc.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media < 6) {
			System.out.println("Reprovado! media: " + media);
		}
		else if (media >= 6 && media < 7) {
			System.out.println("Recupera��o! media: " + media);
		}
		else if (media >= 7 && media < 10) {
			System.out.println("Aprovado! media: " + media);
		}


		
	
		sc.close();

	}

}
