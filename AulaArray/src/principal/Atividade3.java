package principal;

import java.util.Random;
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in); 
		
		Random random = new Random ();
		
		System.out.println(" Sorteio para a turma Java do Senai ");
		
		
		for (int i = 1; i <=10; i++) {
			System.out.println("Digite o nome do participante " + i + " : ");
			String nome = sc.nextLine();		
			String participantes = sc.nextLine();
		}
		
		int participantes = 0;
		int gerador = random.nextInt(participantes);
		
		
		
		
		sc.close();

	}

}
