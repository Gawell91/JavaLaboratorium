package com.company.devices;

public class Electric extends Car{
    public Electric(String producer, String model, Integer yearOfProduction, String colour) {
        super(producer, model, yearOfProduction, colour);
    }

    @Override
    public void Refuel() {
        this.capacitance  = 80.0;
        System.out.println("Naładowano elektryczny samochod do " + capacitance + "kWh");
    }
}
