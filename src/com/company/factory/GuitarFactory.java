package com.company.factory;

import com.company.guitar.Guitar;

public class GuitarFactory {

    public static Guitar getGuitar(GuitarAbstractFactory factory) {
        return factory.createGuitar();
    }

}
