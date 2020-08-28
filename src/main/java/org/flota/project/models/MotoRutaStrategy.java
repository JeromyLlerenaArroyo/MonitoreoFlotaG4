package org.flota.project.models;

import org.flota.project.patterns.RutaStrategy;

import java.util.ArrayList;

public class MotoRutaStrategy implements RutaStrategy {
    private double maxPeso = 1000.00;
    private int maxParadas = 10;

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
        ruta.addPunto(new Recojo(-77.0844, -12.0561, "Jazmines", "Normal"), 20);
        validarPeso(ruta);
        validarPuntos(ruta);
        ruta.addPunto(new Despacho(-77.084774, -12.055502, "Las Torres", "Normal", "7874321"), 30);
        validarPeso(ruta);
        validarPuntos(ruta);
        ruta.addPunto(new Despacho(-77.085750, -12.057957, "Los Suaces", "Urgente", "3324321"),40);
        validarPeso(ruta);
        validarPuntos(ruta);
        ruta.addPunto(new Despacho(-77.084760, -12.058826, "Av. Sol 434", "Normal", "7879876"),50);
        validarPeso(ruta);
        validarPuntos(ruta);
        ruta.addPunto(new Recojo(-77.086194, -12.061448, "Calle 22", "Urgente" ),60);
        validarPeso(ruta);
        validarPuntos(ruta);
        ruta.addPunto(new Despacho(-77.082715, -12.061067),20);
        validarPuntos(ruta);
        validarPeso(ruta);
        ruta.addPunto(new Despacho(-77.081694, -12.067080),40);
        validarPeso(ruta);
        validarPuntos(ruta);
        ruta.addPunto(new Recojo(-77.083207, -12.072865),50);
        validarPeso(ruta);
        validarPuntos(ruta);
        ruta.addPunto(new Despacho(-77.084516, -12.078045),60);
        validarPeso(ruta);
        validarPuntos(ruta);
        ruta.addPunto(new Despacho(-77.081588, -12.077808),80);
        validarPeso(ruta);
        validarPuntos(ruta);
        return ruta;
    }
}
