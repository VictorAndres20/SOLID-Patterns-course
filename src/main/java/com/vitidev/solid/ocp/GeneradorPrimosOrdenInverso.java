package com.vitidev.solid.ocp;

import java.util.ArrayList;
import java.util.List;

public class GeneradorPrimosOrdenInverso extends GeneradorPrimos{

    @Override
    public List<Integer> primos (int limit) {

        List<Integer> primos = new ArrayList<>();
        for (int i = limit; i >= 2; i--) {
            if (esPrimo(i)) {
                primos.add(i);
            }
        }
        return primos;
    }
}
