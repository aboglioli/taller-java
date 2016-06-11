/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author kiriost
 */
public class VentanaBoton extends JFrame implements ActionListener {

    JButton boton;

    public VentanaBoton() {
        // Boton
        setLayout(null);
        boton = new JButton("Salir");
        boton.setBounds(300, 250, 100, 30);
        add(boton);
        boton.addActionListener(this);

        // Esta ventana
        setBounds(0, 0, 450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == boton) {
            System.exit(0); // Termina el programa
        }
    }

}
