/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author kiriost
 */
public class Familia {
    private ArrayList<Persona> personas;

    public Familia() {
        personas = new ArrayList();
        personas.add( new Persona("Solterón") );
    }
    
    public Familia(Persona p) {
        personas = new ArrayList();
        personas.add(p);
    }   

    public void agregarMiembro(Persona p) {
        personas.add(p);
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }
}    
