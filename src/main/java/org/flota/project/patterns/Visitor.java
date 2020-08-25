package org.flota.project.patterns;

import org.flota.project.models.Entrega;
import org.flota.project.models.Recojo;

import java.util.Map;

public interface Visitor {
    Map<String, String> visitRecojo(Recojo recojo);
    Map<String, String> visitEntrega(Entrega entrega);
}
