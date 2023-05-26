package principal;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int [][] numeros = new int [3][3];
		 
		
		int contador = 1;
		
		for (int i = 0; i < numeros.length; i++) {
		     for (int j = 0; j < numeros.length; j++){
				numeros [i][j] = contador; 
		          System.out.print(numeros [i] [j] + "\t");
		          contador++;
		     }
		     System.out.println();
		}*/
		
		
		
		
		
		int[][] numeros  = new int [3] [3] ;
		int contador = 1 ;
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				numeros [i] [j] = contador;
				contador++;
				
				if (i == j) {
					System.out.print(numeros [i][j] + "\t");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		

	}

}
