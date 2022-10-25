

import EJERCICIOS.Estudiante;
import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
	
		int opcion = menu();
		Estudiante estudianteEjemplo = null;
		
		do {
			 									
			switch (opcion) {
		
			case 1: 
				estudianteEjemplo = new Estudiante();
				System.out.println("Estudiante creado correctamente\n");
			break;
			
			case 2: 

				if(estudianteEjemplo != null) {
					System.out.println("Información del estudiante: \n");
					estudianteEjemplo.mostrarInfo();
				}else {
					System.out.println("No existe ningún estudiante\n");
				}
			break;
			
			case 3:
				if(estudianteEjemplo != null) {
					System.out.println("Inserte una nueva nota: \n");
					int nota = keyboard.nextInt();
					estudianteEjemplo.agregarNuevaNota(nota);
					System.out.println("Nota añadida correctamente.\n");
					
				}else {
					System.out.println("No existe ningún estudiante\n");
				}
			break;
			
			case 4: 
				
				if(estudianteEjemplo != null) {
					estudianteEjemplo.reiniciarNotas();
					System.out.println("Notas reiniciadas correctamente.\n");
					
				}else {
					System.out.println("No existe ningún estudiante\n");
				}
			break;
			
			default: System.out.println("Tienes que ingresar un NÚMERO del 1 al 4");
			}
			
			
			System.out.println("\n--------------------------");
			System.out.println("Selecciona la opción que desees pulstando el número correspondiente + ENTER:\n");
			opcion = keyboard.nextInt();				

		}while(opcion != 0);
		
		System.out.println("FIN DEL PROGRAMA\n");
		keyboard.close();
		
	}
	

	static int menu() {
		System.out.println("\n--------------------------");
		System.out.println("Selecciona la opción que desees pulstando el número correspondiente + ENTER:\n");
				
		String[] lista = {
		                       "1. Crear un estudiante",
		                       "2. Visualizar estudiante (si existe)",
		                       "3. Añadir nueva nota al estudiante (si existe)",
		                       "4. Reiniciar las notas del estudiante"
		};
				
		for (int i = 0; i < lista.length; i++) {
	        System.out.println(lista[i]);
	    }
		
		System.out.println("--------------------------");
		
		Scanner keyboard = new Scanner (System.in);
		
		int numero = keyboard.nextInt();
			
		return numero;
		
		
	};



	
	
	
	
}
