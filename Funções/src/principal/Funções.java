package principal;

import java.util.Scanner;

public class Funções {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("entre com o primeiro numero da soma: ");
		int num1 = sc.nextInt();
		
		System.out.println("Entre com o segundo numero da soma :");
		int num2 = sc.nextInt();
		
		somaDoisNumeros (num1,num2);
		
		System.out.println("Abaixo os numeros que foram atribuidos manualmente");
		somaDoisNumeros (15, 25);
		
		mensagem();
		mensagem2(25.63);
		System.out.println(mensagem3());
		System.out.println(mensagem4 (5));
		
		
		
		int meuNumero = 100;
		System.out.println("Numero informado: " + meuNumero);
		
		System.out.println(exemploDoIgor (16.6));
		
	}
	
	static void mensagem () {
		System.out.println("Primeiro void");
	}
	
	static void mensagem2 (double n) {
		System.out.println("O numero informado foi: " + n);
	}
	
	static String mensagem3 () {
	return "Aqui é minha função de número 3 ";
	}
	
	static String mensagem4 (int x) {
		return "Numero informado: " + x;
	}
	
	static int exemploDoIgor (double y) {
		return (int) y;
	}
	
	static void somaDoisNumeros (int a,  int b) {
		int  resultado = a + b;
		System.out.println(" O resultado da soma é: " + resultado);
	}
	
	
	

}
