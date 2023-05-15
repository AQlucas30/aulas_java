package principal;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leia = new Scanner (System.in);
		double primeiro ;
		double segundo ;
		double terceiro  ;
		double quarto ;
		double media;
		
		
		System.out.println("Qual a nota do aluno no primeiro no bimestre: ");
		primeiro = leia.nextInt();
		
		System.out.println("Qual a nota do aluno no segundo bimestre: ");
		segundo = leia.nextInt();
		
		System.out.println("Qual a nota do aluno no terceiro bimestre: ");
		terceiro = leia.nextInt();
			
		System.out.println("Qual a nota do aluno no quarto bimestre: ");		
		quarto = leia.nextInt();
		
		System.out.println("Qual foi a média do aluno no ano?");
		media = (primeiro + segundo + terceiro + quarto)/ 4;
		
		System.out.println("A média é:  "  + media );
		
		leia.close();

		
		
		
		
		
	}

}
