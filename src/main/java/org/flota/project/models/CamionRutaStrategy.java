package org.flota.project.models;

import org.flota.project.patterns.RutaStrategy;

import java.util.ArrayList;

public class CamionRutaStrategy implements RutaStrategy {

    private double maxPeso = 500.00;
    private int maxParadas = 5;

    private void validarPeso(Ruta ruta) {
        if(maxPeso < ruta.getPesoTotal()) {
            System.out.println("se excedió el peso máximo");
        }else{
            System.out.println("aun no se excede el peso máximo");
        } 
    }

    private void validarPuntos(Ruta ruta) {
        if(maxParadas < ruta.getPoints().size()) {
            System.out.println("se excedió el número de paradas");
        }else{
            System.out.println("aun no se excede el número de paradas");
        }
    }

    @Override
    public Ruta crearRuta() {

        Ruta ruta = new Ruta();

        ruta.addPunto(new Recojo(-77.0844, -12.0561, "Las Garzas", "Urgente"), 15);
        validarPeso(ruta);
        validarPuntos(ruta);
        ruta.addPunto(new Despacho(-77.083665, -12.054374, "Jazmines 432", "Normal", "1234321"), 70);
        validarPeso(ruta);
        validarPuntos(ruta);
        ruta.addPunto(new Despacho(-77.080250, -12.056479, "Jazmines 670", "Normal", "7879088"), 80);
        validarPeso(ruta);
        validarPeso(ruta);
        ruta.addPunto(new Despacho(-77.077908, -12.065964, "Calle Alfonso Ugarte", "Urgente", "7867521"), 90);
        validarPeso(ruta);
        validarPuntos(ruta);
        ruta.addPunto(new Despacho(-77.078538, -12.073385, "Teodoro Vargas", "Normal", "9043321"), 100);
        validarPeso(ruta);
        validarPuntos(ruta);
        ruta.addPunto(new Despacho(-77.081588, -12.077808, "Las Flores Sur", "Urgente", "54574321"), 200);
        validarPeso(ruta);
        validarPuntos(ruta);;

        return ruta;
    }
}
