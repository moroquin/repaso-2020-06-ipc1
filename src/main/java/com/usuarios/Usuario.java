package com.usuarios;

public class Usuario {
    
    private String nombre;
    private int juegosGanados;

    private Usuario siguiente;


    public Usuario(String nombre){
        this.nombre = nombre;
        this.juegosGanados = 0;
        this.siguiente = null;
    }

    public void addJuegoGanado() {
        this.juegosGanados++;
    }

    public int getJuegosGanados(){
        return this.juegosGanados;
    }

    public String getNombre(){
        return this.nombre;
    }


    public Usuario getSiguiente() {
        return this.siguiente;        
    }

    public void setSiguiente(Usuario siguiente){
        this.siguiente = siguiente;
    }
}