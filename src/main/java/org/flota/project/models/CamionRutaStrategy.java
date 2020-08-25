package org.flota.project.models;

import org.flota.project.patterns.RutaStrategy;

import java.util.ArrayList;

public class CamionRutaStrategy implements RutaStrategy {

    @Override
    public Ruta crearRuta() {
        Ruta ruta = new Ruta();

        ruta.addPunto(new Recojo(-77.0844, -12.0561));
        ruta.addPunto(new Entrega(-77.083665, -12.054374, "asd", "asda", "asdsada"));
        ruta.addPunto(new Entrega(-77.080250, -12.056479));
        ruta.addPunto(new Entrega(-77.077908, -12.065964));
        ruta.addPunto(new Entrega(-77.078538, -12.073385));
        ruta.addPunto(new Entrega(-77.081588, -12.077808));
        return ruta;
    }
}
