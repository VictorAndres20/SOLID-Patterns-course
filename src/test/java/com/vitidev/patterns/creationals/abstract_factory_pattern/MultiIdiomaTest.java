package com.vitidev.patterns.creationals.abstract_factory_pattern;

import com.vitidev.patterns.creationals.abstract_factory_pattern.src.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiIdiomaTest {

    @Test
    public void test_es() {
        AbstractFactory factory = new FactoryEs();
        Preguntas preguntas = factory.createPreguntas();

        assertEquals("¿qué hora es?", preguntas.preguntaHora() );
        assertEquals("¿qué tiempo hace?", preguntas.preguntaTiempo() );

        Saludos saludos = factory.createSaludos();

        assertEquals("buenos días", saludos.buenosDias());
        assertEquals("buenas tardes", saludos.buenasTardes());
    }

    @Test
    public void test_en() {
        AbstractFactory factory = new FactoryEn();
        Preguntas preguntas = factory.createPreguntas();

        assertEquals("what time is it?", preguntas.preguntaHora() );
        assertEquals("how is the weather?", preguntas.preguntaTiempo() );

        Saludos saludos = factory.createSaludos();

        assertEquals("good morning", saludos.buenosDias());
        assertEquals("good afternoon", saludos.buenasTardes());
    }

}