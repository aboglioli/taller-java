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
public class BecaFotocopias extends Beca {
    private float monto;

    public BecaFotocopias() {
        monto = 200;
    }

    public BecaFotocopias(float monto) {
        this.monto = monto;
    }
    
    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
    
    public String getTipo() {
        return "fotocopias";
    }
}
