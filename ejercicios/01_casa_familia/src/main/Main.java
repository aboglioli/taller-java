package main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Familia familia = new Familia();
        Casa casa = new Casa(familia);
        
        familia.agregarMiembro(new Persona("Maria"));
        
        // Imprimir
        Persona p;
        ArrayList<Persona> personas = familia.getPersonas();
        
        for (int i = 0; i < personas.size(); i++) {
            p = personas.get(i);
            System.out.println(p.getNombre());
        }
    }
    
}
