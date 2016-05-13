package main;

public class Persona {
	private int edad;
	private String nombre;
	private String apellido;

	public Persona() {

	}

	public Persona(int e, String name, String lastname) {
		edad = e;
		nombre = name;
		apellido = lastname;
	}

	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setEdad(int e) {
		edad = e;
	}

	public void setNombre(String nom) {
		nombre = nom;
	}

	public void setApellido(String ape) {
		apellido = ape;
	}
}
