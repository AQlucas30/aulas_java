package entities;

public class Conta {
	
	private String nomeTitular;
	private int numeroConta;
	private int agencia;
	private double saldo;
	
	
	protected Conta() {
		super();
		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
	}


	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar (double deposito) {
		saldo += deposito;
	}
	
	public void sacar (double saque) {
		saldo -= saque;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Titular da conta: " + nomeTitular + " \nAgencia: " + agencia + " Numero da conta: " + numeroConta + "  \nSaldo " + getSaldo();
	}


	

}
