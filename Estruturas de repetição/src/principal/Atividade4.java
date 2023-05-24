package principal;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
	
		int i;
		double d;
	
		
		System.out.println("Qual operação irá ser feita: +, -, * ou / ");
		char operacao = sc.next().charAt(0);
		
		System.out.println("Digite o numero da tabuada: ");
		int numero = sc.nextInt();
		
		
		switch (operacao) {
		case '+':
		    for (i = 1; i <= 100; i++ ) {
			System.out.println(numero + " + " + i + " = " + (i + numero));		
		}
			break; 
		case '-':	
		    for (i = 1; i <= 10; i++ )	{
			System.out.println(numero + " - " + i + " = " + (numero - i));
		}
		    break;
		case '*':
			for (i = 1; i <=10; i++) {	
				System.out.println(numero + " * " + i + " = " + (i * numero));
		}
			break;
		case '/':	
		    for (d = 1; d <=10; d++) {	
				System.out.println(numero + " / " + d + " = " + (d / numero));
		}
			break; 
			
			default: 	
	
			System.out.println("opçao não encontrad!!a");
			
		}
		sc.close();

		
		}
}