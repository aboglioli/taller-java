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
public class Casa {
    private Familia familia;

    public Casa() {
        this.familia = new Familia();
    }
    
    public Casa(Familia familia) {
        this.familia = familia;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }
    
    
}
