package com.company.factory;

import com.company.guitar.AcousticGuitar;
import com.company.guitar.Guitar;

public class AcousticGuitarFactory implements GuitarAbstractFactory  {

    private String model;
    private String brand;
    private String pickups;
    private double scaleLength;
    private int price;

    public AcousticGuitarFactory(String model, String brand, String pickups, double scaleLength, int price) {
        this.model = model;
        this.brand = brand;
        this.pickups = pickups;
        this.scaleLength = scaleLength;
        this.price = price;
    }

    @Override
    public Guitar createGuitar() {
        return new AcousticGuitar(model,brand,pickups,scaleLength,price);
    }

}
