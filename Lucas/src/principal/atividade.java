package principal;

import java.util.Scanner;

public class atividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		int anoN  ;
		int anoAt ;
		int idade ;
		
		System.out.println(" Qual ano voc� nasceu? ");
		anoN = leia.nextInt();
		
		System.out.println("Em que anos estamos?");
		anoAt = leia.nextInt();
		
		idade = anoAt - anoN;
		
		System.out.println("Sua idade � "+ idade + " anos ");
		System.out.println();
		
		
		
 
		
		leia.close();
	}

}
