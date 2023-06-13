package entities;

public class Produto {
	
	private String descricao;
	private int quantidade;
	private double pre�o;
	
	 
	
	
	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	public int getQuantidade() {
		return quantidade;
	}
	
	
	public void adicionaProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProduto (int quantidade) {
		this.quantidade += quantidade;
	}
	
	public double retonarTotalEmEstoque () {
		return quantidade * pre�o;
		
	}
	
	@Override
	public String toString () {
		
		return "Produto: " + descricao + "\nQuabtidade: " +  quantidade + "\nTotal em estoque: " + String.format ("%.2f", retonarTotalEmEstoque ());
	}

}
