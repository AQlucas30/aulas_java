package principal;

import java.util.Scanner;

public class atividadeDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		double salarioL;
		double salarioB;
		double inss ;
		double ir ;
		
		System.out.println("Qual é o seu salário?");
		salarioB = leia.nextDouble();
		
		inss = (salarioB * 5) / 100;
		ir = (salarioB * 11) / 100; 
		salarioL = salarioB - inss - ir;
		
		System.out.println(" Desconto inss: " + inss);
		System.out.println("Desconto IR: " + ir);
		System.out.println("Salario Liquido: R$ " + salarioL);
		
	    
		leia.close();

	}

}
