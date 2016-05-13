package main;

import java.util.ArrayList;

public class Familia {
	private ArrayList<Persona> familia = new ArrayList();

	public Familia() {

	}

	public void agregarMiembro(Persona n) {
		familia.add(n);
	}

	public ArrayList<Persona> verMiembros() {
		return familia;
	}
}
