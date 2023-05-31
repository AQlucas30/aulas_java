package principal;

import java.util.Scanner;

public class MargemDeLucro {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" Entre com o valor do produto: ");
		double valorProduto = sc.nextDouble();
		System.out.println(" Entre com a porcentagem a ser aplicada: ");
		double porcentagem = sc.nextDouble();
		
		retornaValorDevenda ();
		sc.close();
        }   
        static void retornaValorDeVenda (double valorProduto, double porcentagem) {
        	double valorVenda = valorProduto + (valorProduto * (porcentagem / 100));
        	System.out.println("Valor de venda: " + valorenda);
        }
	
		
		
		

	}

}
