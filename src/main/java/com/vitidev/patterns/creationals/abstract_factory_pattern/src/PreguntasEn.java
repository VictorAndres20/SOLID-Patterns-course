package com.vitidev.patterns.creationals.abstract_factory_pattern.src;

import com.vitidev.patterns.creationals.abstract_factory_pattern.src.Preguntas;

public class PreguntasEn implements Preguntas {

	@Override
	public String preguntaHora() {
		return "what time is it?";
	}

	@Override
	public String preguntaTiempo() {
		return "how is the weather?";
	}

	
}
