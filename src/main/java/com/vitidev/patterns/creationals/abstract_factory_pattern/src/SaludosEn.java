package com.vitidev.patterns.creationals.abstract_factory_pattern.src;

import com.vitidev.patterns.creationals.abstract_factory_pattern.src.Saludos;

public class SaludosEn implements Saludos {

	@Override
	public String buenosDias() {
		return "good morning";
	}

	@Override
	public String buenasTardes() {
		return "good afternoon";
	}

}
