package com.vitidev.patterns.creationals.abstract_factory_pattern.src;

import com.vitidev.patterns.creationals.abstract_factory_pattern.src.Saludos;

public class SaludosEs implements Saludos {

	@Override
	public String buenosDias() {
		return "buenos días";
	}

	@Override
	public String buenasTardes() {
		return "buenas tardes";
	}

}
