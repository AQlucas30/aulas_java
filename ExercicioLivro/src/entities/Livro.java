package entities;

public class Livro {
	
	
	/*
	 * ordemsugerida a seguir classe:
	 * 1° atributos da classe
	 * 2º construtores 
	 * 3º metodos get e set
	 * 4° demias metodos 
	  
	 
	 */
	 private String nome;
	 private String edicao;
	 private double valor;
	
	
	
	public Livro(String nome, String titulo, double valor) {
		super();
		this.nome = nome;
		this.edicao = titulo;
		this.valor = valor;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEdicao() {
		return edicao;
	}


	public void setTitulo(String edicao) {
		this.edicao = edicao;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
		if (valor > 100) {
			double taxa = valor * 0.3;
			this.valor += taxa;
		}
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "\nQual o nome do livro:  "  +  nome  +  "\nQual o edicao:  "  +  edicao  +  "\nQual o valor: "  +  valor;
	} 
	
	
	


}
