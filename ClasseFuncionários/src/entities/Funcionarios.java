package entities;

public class Funcionarios {
	
	
	
	public String nome;
	public String cargo;
	public double salario;
	
	public void verificarComissao () {
		if (cargo.equals("gerente") && salario < 5000) {
			salario = salario + (salario *0.015);	
		}
		if (cargo.equals("vendedor") && salario < 1500){
	     salario = salario + (salario *0.02);
		}
		System.out.println(salario);
		
	}
	
	

}
