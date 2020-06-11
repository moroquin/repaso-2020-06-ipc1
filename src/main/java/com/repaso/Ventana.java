package com.repaso;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import com.usuarios.listaUsuarios;

//import com.users.User;

public class Ventana extends JFrame {

    listaUsuarios usuarios;

    public Ventana(String titulo){
        super(titulo);

        usuarios = new listaUsuarios();

        this.setSize(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        setLayout(null);


        usuarios.addUsuario("oliver");
        usuarios.addUsuario("maria");

        JTextArea textarea1=new JTextArea();
        textarea1.setBounds(10,50,400,300);
        add(textarea1);

        textarea1.setText(usuarios.getListaUsuarios());




    }
    
}