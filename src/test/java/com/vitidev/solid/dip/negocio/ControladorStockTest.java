package com.vitidev.solid.dip.negocio;

import com.vitidev.solid.dip.bbdd.InventarioBBDD;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControladorStockTest {

    @Test
    public void test_control_estoc() {
        ControladorStock controlador = new ControladorStock(new InventarioBBDD());

        assertFalse(controlador.necesitaReponer("tienda norte", "mesa"));
        assertTrue(controlador.necesitaReponer("tienda norte", "lampara"));

    }

}