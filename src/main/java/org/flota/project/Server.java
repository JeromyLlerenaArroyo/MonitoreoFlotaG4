package org.flota.project;

import com.esri.arcgisruntime.ArcGISRuntimeEnvironment;

import org.flota.project.models.EntregaProgramada;
import org.flota.project.models.GuiaEntrega;
import org.flota.project.models.Ventana;

import javafx.application.Application;

public class Server {

    public static void main(String[] args) {

        RegistroLog.getInstance().log("Iniciando servidor");

        ArcGISRuntimeEnvironment.setInstallDirectory("C:\\Java\\arcgis-runtime-sdk-java-100.8.0");

        GuiaEntrega guia = new GuiaEntrega();
        guia.agregarEntrega(new EntregaProgramada("09:00-10:00", "23/07/2020"));
        guia.agregarEntrega(new EntregaProgramada("10:00-11:00", "23/07/2020"));
        guia.agregarEntrega(new EntregaProgramada("12:00-13:00", "23/07/2020"));
        guia.listarEntrega();

        Application.launch(Ventana.class, args);
    }

}