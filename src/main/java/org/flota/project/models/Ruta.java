package org.flota.project.models;

import com.esri.arcgisruntime.geometry.Point;

import java.util.ArrayList;

public class Ruta {

    private double pesoTotal = 0;
    private ArrayList<Punto> puntos = new ArrayList<Punto>();
    //private Conductor conductor;

    public void addPunto(Punto punto, int peso){
        puntos.add(punto);
        pesoTotal += peso;
    }

    public ArrayList<Point> getPoints(){
        ArrayList<Point> points = new ArrayList<Point>();
        for (Punto punto : puntos){
            points.add(punto.getPoint());
        }
        return points;
    }

    public ArrayList<Punto> getPuntos(){
        return puntos;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

}