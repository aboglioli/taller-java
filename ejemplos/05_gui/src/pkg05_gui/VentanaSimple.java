/*
 * Ejemplo sacado de:
 * http://www.javaya.com.ar/detalleconcepto.php?codigo=106&inicio=20
 */
package pkg05_gui;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author kiriost
 */
public class VentanaSimple extends JFrame {

    public VentanaSimple() {
        JLabel hola = new JLabel("Hola mundo!");
        add(hola);
        
        this.setSize(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
