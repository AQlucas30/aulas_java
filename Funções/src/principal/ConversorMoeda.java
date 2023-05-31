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

        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();

        // Conversão de real para dólar
        double valorDolar = converterRealParaDolar(valorReal, cotacaoDolar);
        System.out.println("O valor em dólares é: " + valorDolar);

        System.out.print("Digite o valor em dólares: ");
        double valorDolar2 = scanner.nextDouble();

        // Conversão de dólar para real
        double valorReal2 = converterDolarParaReal(valorDolar2, cotacaoDolar);
        System.out.println("O valor em reais é: " + valorReal2);

        scanner.close();
    }
}
