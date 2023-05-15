package principal;

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		double  celsius ;
		double fahrenheit; 
		
		
		System.out.println("Qual a temperatura em Celsius?: ");
		celsius = leia.nextDouble();
		
		fahrenheit = celsius * 1.8 + 32;
		
		System.out.println(" A conversão para Fahrenheit fica: " + fahrenheit);
		
		

		
		leia.close();
	}

}
