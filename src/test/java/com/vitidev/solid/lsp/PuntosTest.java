package com.vitidev.solid.lsp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class PuntosTest {

    private final Punto2D referencia = new Punto2D(3,5);
    private final List<Punto2D> puntos_prueba = Arrays.asList(
            new Punto3D(2,3,0),
            new Punto3D(3,5,0),
            new Punto3D(4,3,0)
    );


    @Test
    public void test_iguales_si_solo_si_distancia_0() {

        for (Punto2D punto: puntos_prueba) {
            Assertions.assertEquals(referencia.equals(punto),
                    referencia.distancia(punto) == 0);
        }
    }

}