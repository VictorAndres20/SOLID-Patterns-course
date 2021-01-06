package com.vitidev.solid.isp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcesadorTextoTest {

    @Test
    public void test_simple() {

        ProcesadorTexto procesador = new ProcesadorTexto();

        procesador.nueva("No");
        procesador.nueva("himporta");
        procesador.nueva("la");
        procesador.nueva("hortografia");

        assertEquals("No himporta la hortografia", procesador.texto());
    }

    @Test
    public void test_con_idioma() {

        ProcesadorTexto procesador = new ProcesadorTexto();

        procesador.nueva("Tengo");
        procesador.nueva("hambre");

        assertEquals("Tengo hambre", procesador.texto());

        assertTrue(procesador.correcto(Idioma.ES));
    }

}