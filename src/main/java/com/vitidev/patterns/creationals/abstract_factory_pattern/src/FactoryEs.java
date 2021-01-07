package com.vitidev.patterns.creationals.abstract_factory_pattern.src;

public class FactoryEs implements AbstractFactory{

    @Override
    public Preguntas createPreguntas() {
        return new PreguntasEs();
    }

    @Override
    public Saludos createSaludos() {
        return new SaludosEs();
    }
}
