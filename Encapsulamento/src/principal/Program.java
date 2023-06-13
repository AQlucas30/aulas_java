package principal;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		Conta conta = new Conta ();
		
		//System.out.println(conta);
		//System.out.println(conta);

		System.out.println("Titular: ");
		conta.setTitular(sc.nextLine());
		
		System.out.println("Agencia: ");
		conta.setAgencia(sc.nextInt());
		
		System.out.println("Numero conta: ");
		conta.setNumeroConta(sc.nextInt());
		
		/*System.out.println("Saldo");
		conta.salario = sc.nextDouble();*/
		
		System.out.println("Entre com o valor Depositado: ");
		double deposito = sc.nextDouble();
		
		conta.depositar(deposito);
		
		System.out.println("Entre com o valor para saque: ");
		double sacar = sc.nextDouble();
		
		conta.sacar(sacar);
		
		System.out.println("Saldo : " + conta.getSaldo() );
		sc.close();

	}

}
