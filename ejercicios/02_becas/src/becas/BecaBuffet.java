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
public class BecaBuffet extends Beca {
    private boolean almuerzo;
    private int cantPlatos;

    public BecaBuffet() {
        almuerzo = true;
        cantPlatos = 20;
    }
    
    public BecaBuffet(boolean almuerzo, int cantPlatos) {
        this.almuerzo = almuerzo;
        this.cantPlatos = cantPlatos;
    }

    public boolean isAlmuerzo() {
        return almuerzo;
    }

    public void setAlmuerzo(boolean almuerzo) {
        this.almuerzo = almuerzo;
    }
    
    public String getTipo() {
        if(almuerzo) {
            return "beca_almuerzo";    
        }
        
        return "beca_cena";
    }

    public int getCantPlatos() {
        return cantPlatos;
    }

    public void setCantPlatos(int cantPlatos) {
        this.cantPlatos = cantPlatos;
    }
    
    
}
