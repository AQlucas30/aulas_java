package principal;

import java.util.Scanner;

public class ExercicioCinco {

	private static final int F = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
	
		double celsius;
		double fhzt;
				
		System.out.println("Qual a temperatura em Fahrenheit?: ");
		fhzt = leia.nextDouble();
		
		celsius = 5 * ((fhzt - 32)/9); 
		
		
		System.out.println(" A conversão para Celsius fica: " + celsius);
				
		
		
		
		leia.close();

	}

}
