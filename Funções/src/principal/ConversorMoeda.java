package principal;

import java.util.Scanner;


public class ConversorMoeda {
    public static double converterRealParaDolar(double valorReal, double cotacaoDolar) {
        return valorReal / cotacaoDolar;
    }

    public static double converterDolarParaReal(double valorDolar, double cotacaoDolar) {
        return valorDolar * cotacaoDolar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em reais: ");
        double valorReal = scanner.nextDouble();

        System.out.print("Digite a cota��o do d�lar: ");
        double cotacaoDolar = scanner.nextDouble();

        // Convers�o de real para d�lar
        double valorDolar = converterRealParaDolar(valorReal, cotacaoDolar);
        System.out.println("O valor em d�lares �: " + valorDolar);

        System.out.print("Digite o valor em d�lares: ");
        double valorDolar2 = scanner.nextDouble();

        // Convers�o de d�lar para real
        double valorReal2 = converterDolarParaReal(valorDolar2, cotacaoDolar);
        System.out.println("O valor em reais �: " + valorReal2);

        scanner.close();
    }
}
