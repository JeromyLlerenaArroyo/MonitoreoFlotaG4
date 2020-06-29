package org.flota.project.models;

import java.util.ArrayList;

public class Entrega {

    private String id; // uuid
    private ArrayList<Producto> productos;
    private String direccion;
    private Double latitud;
    private Double longitud;

    private String estado; // creado/en camnino/entregado

    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public void notificarClienteEntregaCerca(){
        /*
        Logica para notificacion
        - push notification
        - sms
        - llamada automatica
        */
    }
}