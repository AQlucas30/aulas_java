package principal2;

import java.util.Scanner;

import terreno.Area;

public class AreaTerreno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		Area area = new Area();
		
		System.out.println("Qual o valor da largura? ");
		double largura = sc.nextDouble();		
		
		System.out.println("Qual o valor da comprimento?");
		double comprimento = sc.nextDouble();
		area.tamanhoArea(largura, comprimento);
		System.out.println("O tamanho do terreno é de: " + area.area);
		
		
		sc.close();

	}

}
