package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Entre com o primeiro numero: ");
		num1 = sc.nextInt();
			
		System.out.println("Entre com o segundo numero: ");
		num2 = sc.nextInt();
	
		System.out.println("Entre com o terceiro numero: ");
		num3 = sc.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior numero �: " + num1);
		}
		
		if (num2 > num3 && num2 > num1) {
			System.out.println("O maior numero �: " + num2);
		}
		
		if (num3 > num2 && num3 > num1) {
			System.out.println("O maior numero �: " + num3);
		}
	
		sc.close();

	}

}
