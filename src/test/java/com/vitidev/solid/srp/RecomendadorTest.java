package com.vitidev.solid.srp;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RecomendadorTest {

    @Test
    public void test() {
        Recomendador r = new Recomendador();

        List<Pelicula> recomenaciones = r.recomendaciones(BBDD.JUAN);

        Assertions.assertFalse(recomenaciones.contains(BBDD.ET));
    }

    @Test
    public void test_formato() {
        CSVRecommender r = new CSVRecommender();

        String csv = r.recomendacionesCSV(BBDD.JUAN);

        String esperado = "Salvar al soldado Ryan,Spielberg,belico";

        Assertions.assertEquals(esperado, csv);

    }
}