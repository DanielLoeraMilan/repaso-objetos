package uaslp.objetos.escuela;

import java.util.ArrayList;
import java.util.List;

public class EvaluadorDePromediosAdapter {
    private final EvaluadorDePromedios evaluadorDePromedios;


    public EvaluadorDePromediosAdapter(EvaluadorDePromedios evaluadorDePromedios) {
        this.evaluadorDePromedios = evaluadorDePromedios;
    }

    public double evalua(String listaDeCalificaciones) {
        String[] cadenaCalificaciones = listaDeCalificaciones.split(",");
        List<Double> calificaciones = new ArrayList<>();

        for(String calificacion : cadenaCalificaciones){
            calificaciones.add(Double.parseDouble(calificacion));
        }
        return evaluadorDePromedios.evalua(calificaciones);
    }
}
