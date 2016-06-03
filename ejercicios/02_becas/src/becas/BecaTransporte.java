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
public class BecaTransporte extends Beca {
    private int cantidadPasajes;
    private float costoPasaje;

    public BecaTransporte() {
        cantidadPasajes = 60;
        costoPasaje = 6.5f;
    }
    
    public BecaTransporte(int cantidadPasajes, float costoPasaje) {
        this.cantidadPasajes = cantidadPasajes;
        this.costoPasaje = costoPasaje;
    }

    public int getCantidadPasajes() {
        return cantidadPasajes;
    }

    public void setCantidadPasajes(int cantidadPasajes) {
        this.cantidadPasajes = cantidadPasajes;
    }

    public float getCostoPasaje() {
        return costoPasaje;
    }

    public void setCostoPasaje(float costoPasaje) {
        this.costoPasaje = costoPasaje;
    }
    
    public String getTipo() {
        return "transporte";
    }
}
