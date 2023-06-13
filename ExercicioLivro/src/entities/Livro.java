package entities;

public class Livro {
	
	 private String nome;
	 private String titulo;
	 private double valor;
	
	
	
	public Livro(String nome, String titulo, double valor) {
		super();
		this.nome = nome;
		this.titulo = titulo;
		this.valor = valor;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
		if (valor > 100) {
			double taxa = valor * 0.3;
			valor += taxa;
		}
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "Qual o nome do livro: " + nome + "Qual o titulo: " + titulo + "Qual o valor: " + valor;
	}
	
	
	


}
