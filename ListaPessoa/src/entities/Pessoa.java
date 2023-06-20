package entities;

public class Pessoa {
	
		private String nome;
		private int idade;
		private String telefone; 
		
	
	public void Pessoa () {	
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		
	}
	
	
	@Override
	public String toString() {
	
	return "nome: " + nome + " \nTelefone " + telefone + " \nIdade: " + idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setTelefone1(String telefone) {
		this.telefone = telefone;
	}


	
	

	
	

}
