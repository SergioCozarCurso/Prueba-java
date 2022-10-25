package EJERCICIOS;

import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Escribe un número y te daré la suma con los números anteriores");
		
		int numero = keyboard.nextInt();
		
		int base = 1;
		int resultado = 0;
		
		do {
			
						
			resultado +=  base;
			base++;
			
		}
		while(base <= numero);
		
		keyboard.close();
		
		System.out.println(resultado);

	}

}
