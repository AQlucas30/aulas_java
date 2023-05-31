package principal;

import java.util.Scanner;

public class ativdade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner (System.in);
		
		
	double br;
	double eua = 5.02;
	
	System.out.println ("Quanto deseja converter? ");
	br = sc.nextDouble();
	
	double conversaoDolar = br / eua;
	double conversaoBr = br * eua;


	System.out.println("O valor em dolar fica:  U$"+ conversaoDolar);
	
	System.out.println("O valor em real fica: R$"+ conversaoBr);

	
	
	
	
	
	
	
	sc.close();

	}

}
