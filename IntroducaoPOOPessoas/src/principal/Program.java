package principal;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa = new Pessoa ();
		
		pessoa.nome = "Lucas";
		pessoa.idade = 24;
		pessoa.sexo = 'M';
		
		System.out.println("Me chamo " + pessoa.nome + " tenho " + pessoa.idade + " anos " + " e sou " + pessoa.sexo );

	}

}
