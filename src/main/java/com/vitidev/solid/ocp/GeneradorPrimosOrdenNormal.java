package com.vitidev.solid.ocp;

import java.util.ArrayList;
import java.util.List;

public class GeneradorPrimosOrdenNormal extends GeneradorPrimos{
    @Override
    public List<Integer> primos (int limit) {

        List<Integer> primos = new ArrayList<>();
        for (int i = 2; i < limit; i++) {
            if (esPrimo(i)) {
                primos.add(i);
            }
        }
        return primos;

    }
}
