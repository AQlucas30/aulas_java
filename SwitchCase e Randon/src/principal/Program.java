package principal;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random randon = new Random ();
		
		int opcao = randon.nextInt (7)+ 1;
		
		System.out.println(opcao);
		
		switch (opcao) {
		case 1:
			System.out.println("Domingo");
			break;
			
		case 2:
			System.out.println("Segunda");
			break;	
			
		case 3:
			System.out.println("Ter�a");
			break;	
			
		case 4:
			System.out.println("Quarta");
			break;
			
		case 5:
			System.out.println("Quinta");
			break;
			
		case 6:
			System.out.println("Sexta");
			break;
			
		case 7:
			System.out.println("Sabado");
			break;
			
			
		default:
			System.out.println("N�o corresponde a um dia da semana");
		    break;
		}
		/*
		if ( opcao == opcao3) {
			System.out.println("Sextou!");
		}
		
		if (opcao != opcao3) {
			System.out.println("N�o Sextou");
			
		}
		
		else {
			System.out.println("Ent�o Sextou");
		}*/
			

	}

}
