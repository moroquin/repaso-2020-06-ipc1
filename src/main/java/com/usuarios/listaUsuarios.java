package com.usuarios;

public class listaUsuarios {
    
    private Usuario root;

    public listaUsuarios(){
        root = null;
    }

    public void addUsuario(String nombre){
        if (root !=null){
            Usuario tmp = root;
            while(tmp.getSiguiente()!=null)
                tmp = tmp.getSiguiente();
            tmp.setSiguiente(new Usuario(nombre));
        }
        else{
            root = new Usuario(nombre);
        }
    }

    public String getListaUsuarios(){
        String respuesta = "";
        Usuario tmp = root;
        while (tmp!= null){
            respuesta += tmp.getNombre() + " \n";
            tmp = tmp.getSiguiente();
        }
        return respuesta;
    }
}