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
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author kiriost
 */
public class VentanaFormulario extends JFrame implements ActionListener {

    JTextField campoTexto;
    JLabel texto;
    JButton boton;

    public VentanaFormulario() {
        setLayout(null);

        // Campo texto
        campoTexto = new JTextField("Mensaje...");
        campoTexto.setBounds(50, 100, 200, 30);
        add(campoTexto);
        
        // Boton
        boton = new JButton("OK");
        boton.setBounds(300, 100, 100, 30);
        add(boton);
        boton.addActionListener(this);
        
        // Label
        texto = new JLabel("Usted dijo: ...");
        texto.setBounds(50, 200, 300, 30);
        add(texto);

        // Esta ventana
        setBounds(0, 0, 450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == boton) {
            String mensaje = campoTexto.getText();
            texto.setText("Usted dijo: " + mensaje);
        }
    }

}
