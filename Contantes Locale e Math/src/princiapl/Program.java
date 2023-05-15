package princiapl;

import java.util.Locale;
import java.util.Scanner;

class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double PI = 3.14;
		int valor = 50;
		int valor2 = 65;
		
		//realiza a potencia
		System.out.println(Math.pow(2, 0));
		
		//realiza a potência
		System.out.println(Math.pow(2, 2));
		
		
		//Passagem de 2 números como parâmetro, retorna o maior deles
		System.out.println(Math.max(5, 20));
		
		//É o inverso do max, pega o mínimo.
		System.out.println(Math.min (5, 20));
		
		//retorna a raiz quadrada de um número 
		System.out.println(Math.sqrt(18));
		
		//arredonda o número para mais ou para menos
		System.out.println(Math.round(25.6578));
		
		//podemos realizar cálculos com valores retornados pelo cálculo de Math.
		System.out.println(2 + Math.sqrt(18));
		
		
		
		Scanner leia = new Scanner (System.in);
		Locale ponto = new Locale ("en", "us");
		
		//System.out.println("Entre com o valro do dolar: ");
		//double dolar = leia.useLocale(ponto).nextDouble();

        //System.out.println("Valor dolar digitado: " + dolar);
        
        String nome = "Lucas Queiroz"; 
        char sexo = 'M';
        int idade = 24;
        double altura = 1.77546621;
		
        System.out.printf(" O meu nome é %s, sou do sexo %c, tenho %d anos, minha altura é: %.3f ", nome, sexo, idade, altura );
        
        /*operadores de comparação
           > maior que        
           < maior que
           >= maior ou igual a
           <= menor ou igual a
           != diferente de 
           == igual a
           
           
		 */
        
        /*operadores logicos 
         * && = e
         * !! = ou
         * " = negação
         */
		leia.close();
		
		


	}

}
