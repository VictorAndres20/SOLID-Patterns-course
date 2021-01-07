package com.vitidev.patterns.creationals.abstract_factory_pattern.src;

public class FactoryEn implements AbstractFactory{

    @Override
    public Preguntas createPreguntas() {
        return new PreguntasEn();
    }

    @Override
    public Saludos createSaludos() {
        return new SaludosEn();
    }
}
