package principal;

import java.util.Scanner;

import entities.Funcionarios;
import entities.Gerente;
import entities.Secretaria;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		Funcionarios funcionario = new Funcionarios ("Lucas", 24,'M', "Protocolo", 5000);
		Funcionarios gerente = new Gerente ("José", 30, 'M', "Secretário Escolar",3000);
		Funcionarios secretaria = new Secretaria ("Gabriela",20 , 'F', "Caixa",1500 );
		
		funcionario.bonificacao();
		gerente.bonificacao();
		secretaria.bonificacao();
		
		System.out.println(funcionario);
		System.out.println(gerente);
		System.out.println(secretaria);

		
		
		
		sc.close();

	}

	

}
