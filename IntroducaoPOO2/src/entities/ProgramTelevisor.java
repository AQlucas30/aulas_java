package entities;

public class ProgramTelevisor {
	
	
	public int canal;
	public int volume;
	public boolean ligado;
	
	public void subirCanal () {
		if (canal <16) {
			canal++;
		}
		
	public void reduzirCanal () {
		if (canal < 1) {
			    canal--;
		}
			
	public void aumentarVolume () {	
		if (volume <10) {
			volume++;
		}
		
	public void diminuirVolume () {	
		if (volume < 0) {
			volume++;
		}
		
	public void ligarTelevisor () {
		ligado = true;
	}
	
	public void desligarTelevisor () {
		ligado = false;
	}
	
	public void mostrarStatus () {
		
	}
	} 
	}
		
	
	}
	

}
