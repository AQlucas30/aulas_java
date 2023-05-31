package principal;

import entities.Carro;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro carro = new Carro ();
		Carro carro2 = new Carro ();
		
		carro.modelo = "civic";
		carro.ano = 2012;
		carro.cor = "preto";
		
		carro2.modelo = "gol";
		carro2.ano = 2022;
		carro2.cor = "branco";
		
		
		System.out.println("carro: " + carro.ano + " " + carro.modelo);
		System.out.println("carro2: " + carro2.ano  + " " + carro2.modelo);

	}

}
