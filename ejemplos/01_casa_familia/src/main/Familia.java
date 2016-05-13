/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author kiriost
 */
public class Familia {
    private Persona persona1;
    private Persona persona2;
    private Persona persona3;

    public Familia(Persona persona1, Persona persona2, Persona persona3) {
        this.persona1 = persona1;
        this.persona2 = persona2;
        this.persona3 = persona3;
    }

    public Persona getPersona1() {
        return persona1;
    }

    public void setPersona1(Persona persona1) {
        this.persona1 = persona1;
    }

    public Persona getPersona2() {
        return persona2;
    }

    public void setPersona2(Persona persona2) {
        this.persona2 = persona2;
    }

    public Persona getPersona3() {
        return persona3;
    }

    public void setPersona3(Persona persona3) {
        this.persona3 = persona3;
    }
    
    
}
