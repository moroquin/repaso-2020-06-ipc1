package com.repaso;

import javax.swing.JFrame;

public class Ventana extends JFrame {

    public Ventana(String titulo){
        super(titulo);
        this.setSize(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
}