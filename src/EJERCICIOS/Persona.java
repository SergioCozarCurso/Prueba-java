package EJERCICIOS;

public class Persona {
	
	private int id;
	private int edad;
	private String telefono;
	private int numeroDeNotas;
	private float sumaDeNotas;
	private float notaMedia;

	public Persona() {
		this.id = 256485;
		this.edad = 29;
		this.telefono = "677895248";
		this.numeroDeNotas = 9;
		this.sumaDeNotas = 85;
		this.notaMedia = this.sumaDeNotas / this.numeroDeNotas;
	}
	
	public Persona(int id, int edad, String telefono, int numeroDeNotas, float sumaDeNotas) {
		this.id = id;
		this.edad = edad;
		this.telefono = telefono;
		this.numeroDeNotas = numeroDeNotas;
		this.sumaDeNotas = sumaDeNotas;
		this.notaMedia = this.sumaDeNotas / this.numeroDeNotas;
	}
	
	public Persona(int id) {
		this.id = id;
	}
	
	public Persona(int id, int edad, String telefono) {
		this.id = id;
		this.edad = edad;
		this.telefono = telefono;
	}

	public static void main(String[] args) {	

	}
	
	public void mostrarInfo() {
		System.out.println("Id: " + this.id);
		System.out.println("Edad: " + this.edad);
		System.out.println("Telefono: " + this.telefono);
		System.out.println("numeroDenotas: " + this.numeroDeNotas);
		System.out.println("sumaDeNotas: " + this.sumaDeNotas);
		System.out.println("notaMedia: " + this.notaMedia);
	}
	
	public void agregarNuevaNota(float nota) {
		
		this.numeroDeNotas++;
	
		this.sumaDeNotas += nota;
		
		this.notaMedia = this.sumaDeNotas / this.numeroDeNotas;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void setNumeroDeNotas(int numeroDeNotas) {
		this.numeroDeNotas = numeroDeNotas;
	}
	
	public void setSumaDeNotas(float sumaDeNotas) {
		this.sumaDeNotas = sumaDeNotas;
	}
	
	public void setNotaMedia(float notaMedia) {
		this.notaMedia = notaMedia;
	}

}
