package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int [] numero = new int [5];
		int [] numero2 = {100, 250 ,02, 25, 88};
		String[] nome = new String [3];
		
		numero [0] = 10;
		numero [1] = 25;
		numero [2] = 1;
		numero [3] = 99;
		numero [4] = 33;
		
		System.out.println(numero[4]);
		System.out.println(numero2 [2]);*/
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos noms deseja salvar na memoria? ");
		int qtd = sc.nextInt();
		sc.nextLine();		
		
		String [] nomes = new String [qtd];
		//primeiro para exibir os dados
		for (int contador = 0; contador < nomes.length; contador++) {
			System.out.print("Entre com o nome: ");
			nomes [contador] = sc.nextLine();
		}
		// o segunda for para exibir os dados
		for (int contador = 0; contador < nomes.length; contador++) {
			System.out.println(nomes[contador]);
		}
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		String verificar = "Lucas";
		if (nomes [0].equals(verificar)) {
			System.out.println("É igual");
		}
		
		sc.close();
		
		/*String nome1 = new String ("Lucas");
		String nome2 = new String ("Lucas");
		String nome3 = "Lucas";

		System.out.println(nome1 ==(nome2));
		
		//sc.close();*/
		


		


	}

}
