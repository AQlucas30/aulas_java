package principal3;

import java.util.Scanner;

import entities.Televisor;


public class programTelevisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		Televisor tv = new Televisor ();
		
		tv.mostrarStatus();
		
		tv.ligarTelevisor();
		
		tv.mostrarStatus();
		
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		
		tv.subirCanal();
		tv.subirCanal();
		tv.subirCanal();
		
		tv.mostrarStatus();
		
		tv.aumentarVolume();
		
	
		
	}

}
