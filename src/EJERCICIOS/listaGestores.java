package EJERCICIOS;

import java.util.Scanner;

public class listaGestores {

	public listaGestores() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int numero = 0;
		
		
		do {
			System.out.println("Pulsa un número del 1 al 6");
			
						
			numero = keyboard.nextInt();
			
			
			switch (numero) {
			case 1: System.out.println("1. Gestores <--\n2. Clientes\n3. Transferencias\n4. Mensajes\n5. Préstamos\n6. Salir");
			break;
			case 2: System.out.println("1. Gestores\n2. Clientes <--\n3. Transferencias\n4. Mensajes\n5. Préstamos\n6. Salir");
			break;
			case 3: System.out.println("1. Gestores\n2. Clientes\n3. Transferencias <--\n4. Mensajes\n5. Préstamos\n6. Salir");
			break;
			case 4: System.out.println("1. Gestores\n2. Clientes\n3. Transferencias\n4. Mensajes <--\n5. Préstamos\n6. Salir");
			break;
			case 5: System.out.println("1. Gestores\n2. Clientes\n3. Transferencias\n4. Mensajes\n5. Préstamos <--\n6. Salir");;
			break;
			case 6: System.out.println("1. Gestores\n2. Clientes\n3. Transferencias\n4. Mensajes\n5. Préstamos\n6. Salir <--");
			break;
			
			default: System.out.println("Tienes que ingresar un NÚMERO del 1 al 6");
			}
			
		}while(numero != 6);
		
		System.out.println("Fin del programa");
		keyboard.close();

	}

}
