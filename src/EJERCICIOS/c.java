package EJERCICIOS;

import java.util.Scanner;


public class c {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Escribe un número y te diré si es primo");
		
		int numero = keyboard.nextInt();
		
		keyboard.close();
		
		boolean primo = true;
		
		for(int i = 2; i < numero; i++) {
			
			if (numero%i == 0) {
				primo = false;
			}
		}
		
		System.out.println(primo);
		
		

	}
		

}
