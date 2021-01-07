package com.vitidev.patterns.creationals.abstract_factory_pattern.src;

import com.vitidev.patterns.creationals.abstract_factory_pattern.src.Preguntas;

public class PreguntasEs implements Preguntas {

	@Override
	public String preguntaHora() {
		return "¿qué hora es?";
	}

	@Override
	public String preguntaTiempo() {
		return "¿qué tiempo hace?";
	}

}
