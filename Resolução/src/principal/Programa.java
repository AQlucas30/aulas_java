package principal;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		
        int ano;
		
		System.out.println("Entre com o ano para saber se � bissecto");
		ano = sc.nextInt();
		
		if (ano % 4 == 0 && ano % 100 != 0 ) {
			System.out.println("� um ano bissext");
		}
		else if (ano % 400 == 0) {
			
		}
		else {
			System.out.println("O ano n�o � bissexto!");
			
			sc.close();
		}
			

	}

}
