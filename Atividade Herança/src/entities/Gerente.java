package entities;

public class Gerente extends Funcionarios  {

	

	public Gerente(String nome, int idade, char sexo, String departamento, double salario) {
		super(nome, idade, sexo, departamento, salario);
		// TODO Auto-generated constructor stub
	}
	

	public void gerente( double salario) {
		// TODO Auto-generated method stub
		this.salario += 500.00;
	}
	
	
	
}
