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
		
		//realiza a pot�ncia
		System.out.println(Math.pow(2, 2));
		
		
		//Passagem de 2 n�meros como par�metro, retorna o maior deles
		System.out.println(Math.max(5, 20));
		
		//� o inverso do max, pega o m�nimo.
		System.out.println(Math.min (5, 20));
		
		//retorna a raiz quadrada de um n�mero 
		System.out.println(Math.sqrt(18));
		
		//arredonda o n�mero para mais ou para menos
		System.out.println(Math.round(25.6578));
		
		//podemos realizar c�lculos com valores retornados pelo c�lculo de Math.
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
		
        System.out.printf(" O meu nome � %s, sou do sexo %c, tenho %d anos, minha altura �: %.3f ", nome, sexo, idade, altura );
        
        /*operadores de compara��o
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
         * " = nega��o
         */
		leia.close();
		
		


	}

}
