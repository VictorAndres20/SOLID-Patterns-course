package com.vitidev.solid.ocp;

import java.util.ArrayList;
import java.util.List;

public abstract class GeneradorPrimos implements IGeneradorPrimos{

    protected boolean esPrimo (int candidato) {
        for (int i = 2; i < candidato; i++) {
            if (candidato % i == 0) {
                return false;
            }
        }

        return true;
    }
}
