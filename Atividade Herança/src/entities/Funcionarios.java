package entities;

public class Funcionarios {
		
		private String nome;
		private int idade;
		private char sexo;
		private String departamento;
		protected double salario;
		
	
		public Funcionarios(String nome, int idade, char sexo, String departamento, double salario){ 
			super();
			this.nome = nome;
			this.idade = idade;
			this.sexo = sexo;
			this.departamento = departamento;
			this.salario = salario = salario;
		}
		
		public Funcionarios(String string, int i, char c, String string3) {
			super();
			// TODO Auto-generated constructor stub
		}


		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(String string) {
			this.idade = idade;
		}

		public char getSexo() {
			return sexo;
		}

		public void setSexo(char sexo) {
			this.sexo = sexo;
		}

		public String getDepartamento() {
			return departamento;
		}

		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}

		
		public void setSalario(double salario) {
			this.salario = salario;
		}

		public double getSalario() {
			return salario;
		}


		public void  bonificacao () {
			this.salario += 150.00;
				
			}
			
			
			@Override
			public String toString() {
				return "Nome: " + nome + " \nIdade: " + idade + " \nSexo: " + sexo + " \nDepartamento: " + departamento + " \nSalario: " + getSalario ();
			
		}

			
		

		

		

		
		
}
