package EJERCICIOS;

public class a {

	public static void main(String[] args) {
		
		int numero = 1;
		int multiplicador = 0;
		
		do {
			System.out.println(numero * multiplicador);
			multiplicador++;
			
			if(multiplicador == 10) {
				multiplicador = 0;
				numero++;
			}
		}while(numero <= 10);

	}

}
