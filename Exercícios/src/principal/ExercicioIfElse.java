package principal;

import java.util.Random;
import java.util.Scanner;

public class ExercicioIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random randon = new Random ();
		Scanner sc = new Scanner (System.in);
		
		
		int dado1 = randon.nextInt (6)+ 1;
		
		int dado2 = randon.nextInt (6)+ 1;
		
		int dado3 = randon.nextInt (6)+ 1;
		
		int soma = dado1 + dado2 + dado3;
		
		int bonus = 0;
		
		int total = soma; 

		System.out.println("Numeros de dados:" + dado1
		+	","	+ dado2 + "," + dado3);
		

		
		if (dado1 == dado2 && dado2 == dado3) {
			System.out.println("Você é muito sortudo!!!");
			soma = soma + 6;
		}
		else if (dado1 == dado2 || dado1 == dado3 || dado2 == dado3);
		    soma = soma + 2;
	        
	    if (total + bonus <= 15  ) {
	    	System.out.println("Lamneto mais você perdeu");
	    }
	    else if (total + bonus >= 15) {
	    	System.out.println("Parabens você ganhou");
	    }
	    	
	    System.out.println("Soma: " + (soma + bonus));

	
	
		
	
		
		
		
	
		
		
	}

}
