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
public class VentanaMultiplesBotones extends JFrame implements ActionListener {

    JButton boton1, boton2, boton3;

    public VentanaMultiplesBotones() {
        setLayout(null);

        // Botones
        boton1 = new JButton("1");
        boton1.setBounds(10, 100, 90, 30);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton("2");
        boton2.setBounds(110, 100, 90, 30);
        add(boton2);
        boton2.addActionListener(this);

        boton3 = new JButton("3");
        boton3.setBounds(210, 100, 90, 30);
        add(boton3);
        boton3.addActionListener(this);

        // Esta ventana
        setBounds(0, 0, 450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            setTitle("boton 1");
        }
        if (e.getSource() == boton2) {
            setTitle("boton 2");
        }
        if (e.getSource() == boton3) {
            setTitle("boton 3");
        }
    }

}
