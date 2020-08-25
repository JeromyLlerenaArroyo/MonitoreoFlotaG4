package org.flota.project.models;

import com.google.gson.JsonObject;
import org.flota.project.patterns.Visitor;

import java.util.HashMap;
import java.util.Map;

public class JSONExportVisitor implements Visitor {

    @Override
    public Map<String, String> visitRecojo(Recojo recojo) {
        Map<String, String> json = new HashMap <>();
        json.put("comentarios", recojo.getComentarios());
        json.put("direccion", recojo.getDireccion());
        System.out.println(json);
        return json;
    }

    @Override
    public Map<String, String> visitEntrega(Entrega entrega) {
        Map<String, String> json = new HashMap <>();
        json.put("comentarios", entrega.getComentarios());
        json.put("direccion", entrega.getDireccion());
        json.put("documento", entrega.getDocumento());
        System.out.println(json);
        return json;
    }
}
