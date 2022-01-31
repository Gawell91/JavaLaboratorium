package com.company.devices;

public class Diesel extends Car{
    public Diesel(String producer, String model, Integer yearOfProduction, String colour) {
        super(producer, model, yearOfProduction, colour);
    }

    @Override
    public void Refuel() {
        this.oil  = 70.0;
        System.out.println("Zatankowano zbiornik z olejem napedowym w samochodzie" + oil + " l");
    }
}
