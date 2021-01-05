package com.vitidev.solid.ocp;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

class GeneradorPrimosTest {

    @Test
    public void test_orden_natural() {

        GeneradorPrimos generador = new GeneradorPrimosOrdenNormal();
        List<Integer> expected = Arrays.asList(2,3,5,7,11,13);

        assertThat(generador.primos(15), is(expected));
    }

    @Test
    public void test_orden_inverso() {

        GeneradorPrimos generador = new GeneradorPrimosOrdenInverso();
        List<Integer> expected = Arrays.asList(13,11,7,5,3,2);

        assertThat(generador.primos(15), is(expected));
    }

}