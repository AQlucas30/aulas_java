package principal;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         /*
          * variaveis são espaço alocados na memoria que
            salvam uma informação (um dado)   
           
            o tipo int armazena núemros inteiros
            int são numeros: 1, 2, 3, 10, 150...
            
            double que são núemros com casa decimais 
            exemplo:10.50, 25.99 ...
            
            Char é o tipo que armazaena um caractere é 
            um tipo "literal" e a sua inicialização é feita
            com aspas simples 
            
            Strig é uma classe do java utilizada para armazenar
            cadeias de caracteres (frases por exemplo)sua inicialização
            é feita com aspas duplas
            
            exemplos de String: noms, locais... 
          */
		
		int numero = 10;
	    double preçoDaCamisa = 20.52; 
	    String nome = "Lucas Queiroz";
	    char sexo = 'M';
	    
	    int num1 = 5;
	    int num2 = 10;
	    int resultado = num1 + num2;
	    
	    String nome2 = "Lucas Alves";
	    int num3 = 24;
	    double saldoConta = 950.99;
	    
	    
	System.out.println(numero);	
	System.out.println(preçoDaCamisa);
	System.out.println(nome);	
	System.out.println(sexo);
	
	preçoDaCamisa = 50.65;
	System.out.println(preçoDaCamisa);
	System.out.println();
	System.out.println();
	
	System.out.print(nome);
	System.out.print(sexo);
	System.out.print(preçoDaCamisa);
	System.out.println();
	System.out.println();
	
	System.out.print(nome + " " + sexo + " " + " " + preçoDaCamisa); 
	System.out.println();
	System.out.println();
	
	
	
	System.out.print(nome + " comprou uma camisa com o valor de: " + preçoDaCamisa);
	
	nome = "Paulo";
	preçoDaCamisa = 29.99;		
	System.out.println();
	System.out.print(nome + " comprou uma camisa com o valor de: " + preçoDaCamisa);
    System.out.println(); 
	System.out.println(2 + 2 );
	System.out.println();
	System.out.println();
	System.out.println(num1 + num2);
	System.out.println("O resultado é: " + resultado);
	System.out.println("O resultado é: " + (num1 + num2) );
	
	/*Criar uma variavel com seu nome 
	 Crie uma variavel com sua idade
	 Crie uma variavel com saldo de conta 
	 mostre na tela a frase
	 Lucas Queiroz tem 24 anos e possui 5 reais na conta
	*/
	System.out.println();
	System.out.println();
	System.out.println(nome2 + " " +  "tem" + " " + num3 + " " + "anos" + " " + " " + "e possui " + " " + saldoConta + " " + "em sua conta.");
	System.out.println(nome2 + " tem " + num3 + " anos " +  " e possui " + saldoConta + " em sua conta. ");

	
	
	} 
	
	
	
      
     
}
