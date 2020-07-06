package org.flota.project;

import java.io.IOException;

//import com.esri.arcgisruntime.ArcGISRuntimeEnvironment;

import org.flota.project.models.Ventana;

import javafx.application.Application;

public class Server {

    public static void main(String[] args) throws IOException {
        RegistroLog.getInstance().error("Iniciando servidor", RegistroLog.FILE_CHANNEL);

        ArcGISRuntimeEnvironment.setInstallDirectory("C:\\Java\\arcgis-runtime-sdk-java-100.8.0");

        Application.launch(Ventana.class, args);
    }

}