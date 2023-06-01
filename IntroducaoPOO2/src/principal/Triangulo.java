package principal;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		Triangulo triangulo = new Triangulo();
		
		System.out.println("Qual valor do priemeiro lado: ");
		double lado1 = sc.nextDouble();
		
		System.out.println("Qual o valor do segundo lado: ");
		double lado2 = sc.nextDouble();
		
		System.out.println("Qual o valor do terceiro lado: ");
		double lado3 = sc.nextDouble();
		
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("O triângulo é equilátero.");
		}else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("O triângulo é Isósceles.");
		}else {
			System.out.println("O triângulo é escaleno.");
		}
		
		
		sc.close();
		

	}

}
