package EJERCICIOS;

public class Estudiante {

	private int id;
	private int edad;
	private String telefono;
	private int numeroDeNotas;
	private float sumaDeNotas;
	private float notaMedia;

	public Estudiante() {
		this.id = 256485;
		this.edad = 29;
		this.telefono = "677895248";
		this.numeroDeNotas = 9;
		this.sumaDeNotas = 85;
		this.notaMedia = this.sumaDeNotas / this.numeroDeNotas;
	}
	
	public Estudiante(int id, int edad, String telefono, int numeroDeNotas, float sumaDeNotas) {
		this.id = id;
		this.edad = edad;
		this.telefono = telefono;
		this.numeroDeNotas = numeroDeNotas;
		this.sumaDeNotas = sumaDeNotas;
		this.notaMedia = this.sumaDeNotas / this.numeroDeNotas;
	}
	
	public Estudiante(int id) {
		this.id = id;
	}
	
	public Estudiante(int id, int edad, String telefono) {
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
	
	
	public void reiniciarNotas() {
		this.numeroDeNotas = 0;
		this.sumaDeNotas = 0;
		this.notaMedia = 0;
	}
	
	public void agregarNuevaNota() {
		
	}
	
	
	public void agregarNuevaNota(float nota) {
		
		this.numeroDeNotas++;
		
		this.sumaDeNotas += nota;
		
		this.notaMedia = this.sumaDeNotas / this.numeroDeNotas;
	}
	
	
	public void agregarNuevaNota(float nota, boolean reinicio) {
		
		if (reinicio) {			
			this.reiniciarNotas();
		}
		
		this.agregarNuevaNota(nota);	
	}
	
	public static Estudiante compararMedia (Estudiante a, Estudiante b) {
		
		
		
		if (a.notaMedia > b.notaMedia) {
			return a;
		}
		
		return b;
		
		
	}
	
	
	public int getId() {
		return this.id;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public String getTelefono() {
		return this.telefono;
	}
	
	public int getNumeroDeNotas() {
		return this.numeroDeNotas;
	}
	
	public float getSumaDeNotas() {
		return this.sumaDeNotas;
	}
	
	public float getNotaMedia() {
		return this.notaMedia;
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
	
	public static Estudiante crearEstudiante() {
		return new Estudiante();
	}
	

}
