package principal;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         /*
          * variaveis s�o espa�o alocados na memoria que
            salvam uma informa��o (um dado)   
           
            o tipo int armazena n�emros inteiros
            int s�o numeros: 1, 2, 3, 10, 150...
            
            double que s�o n�emros com casa decimais 
            exemplo:10.50, 25.99 ...
            
            Char � o tipo que armazaena um caractere � 
            um tipo "literal" e a sua inicializa��o � feita
            com aspas simples 
            
            Strig � uma classe do java utilizada para armazenar
            cadeias de caracteres (frases por exemplo)sua inicializa��o
            � feita com aspas duplas
            
            exemplos de String: noms, locais... 
          */
		
		int numero = 10;
	    double pre�oDaCamisa = 20.52; 
	    String nome = "Lucas Queiroz";
	    char sexo = 'M';
	    
	    int num1 = 5;
	    int num2 = 10;
	    int resultado = num1 + num2;
	    
	    String nome2 = "Lucas Alves";
	    int num3 = 24;
	    double saldoConta = 950.99;
	    
	    
	System.out.println(numero);	
	System.out.println(pre�oDaCamisa);
	System.out.println(nome);	
	System.out.println(sexo);
	
	pre�oDaCamisa = 50.65;
	System.out.println(pre�oDaCamisa);
	System.out.println();
	System.out.println();
	
	System.out.print(nome);
	System.out.print(sexo);
	System.out.print(pre�oDaCamisa);
	System.out.println();
	System.out.println();
	
	System.out.print(nome + " " + sexo + " " + " " + pre�oDaCamisa); 
	System.out.println();
	System.out.println();
	
	
	
	System.out.print(nome + " comprou uma camisa com o valor de: " + pre�oDaCamisa);
	
	nome = "Paulo";
	pre�oDaCamisa = 29.99;		
	System.out.println();
	System.out.print(nome + " comprou uma camisa com o valor de: " + pre�oDaCamisa);
    System.out.println(); 
	System.out.println(2 + 2 );
	System.out.println();
	System.out.println();
	System.out.println(num1 + num2);
	System.out.println("O resultado �: " + resultado);
	System.out.println("O resultado �: " + (num1 + num2) );
	
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
