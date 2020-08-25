package org.flota.project.models;

import org.flota.project.patterns.RutaStrategy;

import java.util.ArrayList;

public class MotoRutaStrategy implements RutaStrategy {
    @Override
    public Ruta crearRuta() {
        Ruta ruta = new Ruta();
        ruta.addPunto(new Recojo(-77.0844, -12.0561));
        ruta.addPunto(new Despacho(-77.084774, -12.055502));
        ruta.addPunto(new Despacho(-77.085750, -12.057957));
        ruta.addPunto(new Despacho(-77.084760, -12.058826));
        ruta.addPunto(new Recojo(-77.086194, -12.061448));
        ruta.addPunto(new Despacho(-77.082715, -12.061067));
        ruta.addPunto(new Despacho(-77.081694, -12.067080));
        ruta.addPunto(new Recojo(-77.083207, -12.072865));
        ruta.addPunto(new Despacho(-77.084516, -12.078045));
        ruta.addPunto(new Despacho(-77.081588, -12.077808));
        return ruta;
    }
}
