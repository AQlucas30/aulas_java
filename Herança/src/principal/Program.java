package principal;

import java.util.Scanner;

import entities.ContaPoupança;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		ContaPoupança contaPoupanca = new ContaPoupança();
		
		
		System.out.println("Entre com o titular da conta: ");
		contaPoupanca.setNomeTitular(sc.nextLine());
		
		System.out.println("Entre com a conta: ");
		contaPoupanca.setNumeroConta(sc.nextInt());
		
		System.out.println("Entre com a agencia: ");
		contaPoupanca.setAgencia(sc.nextInt());
		
		System.out.println("Qual valor do deposito: ");
		contaPoupanca.depositar(sc.nextDouble());
		
		System.out.println("Dados da conta");
		System.out.println(contaPoupanca);
		
		System.out.println("Entre com o valor do saque: ");
		contaPoupanca.sacar(sc.nextDouble());
		
		System.out.println("Dacos da conta: ");
		System.out.println(contaPoupanca);
		
		
		
		
		
		
		sc.close();

	}

}
