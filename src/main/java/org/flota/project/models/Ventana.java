package org.flota.project.models;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import com.esri.arcgisruntime.mapping.view.GraphicsOverlay;
import com.esri.arcgisruntime.geometry.Point;
import com.esri.arcgisruntime.geometry.SpatialReferences;
import com.esri.arcgisruntime.mapping.view.Graphic;
import com.esri.arcgisruntime.symbology.SimpleMarkerSymbol;

import java.util.Arrays;

public class Ventana extends Application {

    private Mapa mapaBase;

    @Override
    public void start(Stage stage) throws Exception {

        // set the title and size of the stage and show it
        stage.setTitle("Sistema de Monitoreo de Vehiculos");
        stage.setWidth(800);
        stage.setHeight(700);
        stage.show();

        // create a JavaFX scene with a stack pane as the root node and add it to the scene
        StackPane stackPane = new StackPane();
        Scene scene = new Scene(stackPane);
        stage.setScene(scene);

        // create a MapView to display the map and add it to the stack pane
        mapaBase = new Mapa();
        mapaBase.imprimeCoordenadasActual();
        stackPane.getChildren().add(mapaBase.getMapView());

        // create a graphics overlay for displaying different geometries as graphics
        GraphicsOverlay graphicsOverlay = new GraphicsOverlay();
        mapaBase.getMapView().getGraphicsOverlays().add(graphicsOverlay);

        // create a point geometry
        Point point = new Point(-77.0844, -12.0561, SpatialReferences.getWgs84());
        Graphic pointGraphic = new Graphic(point, new SimpleMarkerSymbol(SimpleMarkerSymbol.Style.DIAMOND, 0xFF0000FF, 14));

        graphicsOverlay.getGraphics().addAll(Arrays.asList(pointGraphic));
        //graphicsOverlay.getGraphics().remove(point);
        //stackPane.getChildren().addAll(mapaBase.getMapView());

    }
}