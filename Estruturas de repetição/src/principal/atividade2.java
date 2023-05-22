package principal;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        Scanner sc = new Scanner(System.in);
		        double somaAlturas = 0;
		        int contador = 1;
		        

		        while (contador <= 5) {
		            System.out.print("Digite a altura da pessoa " + contador + " (em metros): ");
		            double altura = sc.nextDouble();
		            somaAlturas += altura;
		            contador++;
		        }

		        double mediaAlturas = somaAlturas / 5; {
		        System.out.println("A média de altura é: " + mediaAlturas);

		        sc.close();
		    }
		}

		
		
		
		
		
		
	

	}

}
