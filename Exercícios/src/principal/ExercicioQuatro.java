package principal;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		double horasTrabalhada ;
		double  valorPorHora ;
		double media ;
		int diasTrabalhado ;
		
		System.out.println("Quanto o funcion�rio ganha por hora?");
		valorPorHora = leia.nextDouble();
		
		System.out.println("Quantas horas de trabalho o funcion�rio trabalha?");
		horasTrabalhada = leia.nextDouble();
		
		System.out.println("Quantos dias o funcion�rio Trabalhou?: ");
		diasTrabalhado = leia.nextInt();
		
		System.out.println(" Quanto ele ganhou no m�s atual "  + ((valorPorHora * horasTrabalhada)* diasTrabalhado));
		
		
		leia.close();
		
		
		

	}

}
