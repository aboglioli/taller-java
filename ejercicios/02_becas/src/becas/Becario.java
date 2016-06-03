/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becas;

/**
 *
 * @author kiriost
 */
public class Becario {
    private Beca beca;
    private String nombre;

    public Becario(Beca beca, String nombre) {
        this.nombre = nombre;
        this.beca = beca;
    }

    public Beca getBeca() {
        return beca;
    }

    public void setBeca(Beca beca) {
        this.beca = beca;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getTipo() {
        return beca.getTipo();
    }
    
    
}
