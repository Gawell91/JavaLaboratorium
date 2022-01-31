package com.company.devices;

public class LPG extends Car{
    public LPG(String producer, String model, Integer yearOfProduction, String colour) {
        super(producer, model, yearOfProduction, colour);

    }

    @Override
    public void Refuel() {
        this.gas  = 50.0;
        System.out.println("Zatankowano zbiornik gazem w samochodzie " + gas + " l");
    }
}
