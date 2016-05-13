package main;

public class Main {

	public static void main(String[] args) {
		Persona juan = new Persona(35, "Juan", "Perez");
		Persona maria = new Persona(35, "Maria", "Gonzalez");
		Persona pedro = new Persona(12, "Pedro", "Perez Gonzalez");

		Familia perez = new Familia();
		perez.agregarMiembro(juan);
		perez.agregarMiembro(pedro);
		perez.agregarMiembro(maria);

		Casa dpto = new Casa("San Martin 1235, 4 piso, dpto 3", perez, 4444444);
	}

}
