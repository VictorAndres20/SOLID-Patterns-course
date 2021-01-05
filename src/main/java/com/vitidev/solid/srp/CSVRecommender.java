package com.vitidev.solid.srp;

import java.util.stream.Collectors;

public class CSVRecommender {

    private Recomendador recomendador;

    public CSVRecommender(Recomendador recomendador){
        this.recomendador = recomendador;
    }

    public CSVRecommender(){
        this.recomendador = new Recomendador();
    }

    public String recomendacionesCSV (Cliente cliente) {

        return recomendador.recomendaciones(cliente).stream()
                .map(p -> (String.join(",",p.getTitulo(),p.getDirector(),p.getGenero())))
                .collect(Collectors.joining("\n"));
    }
}
