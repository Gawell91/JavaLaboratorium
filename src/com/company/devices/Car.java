package com.company.devices;

import com.company.Human;

public class Car extends Device {
    public Double engineVolume;

    public String plates;
    public Double value;
    public Car(String producer, String model, Integer yearOfProduction, String colour) {
        super(producer, model, yearOfProduction, colour);
        this.engineVolume = 2.0;
        this.value = 0.0;
        this.plates = "CBR 18MX";
        //@Override
        public void turnOn(){
            System.out.println("Przekrecam kluczyk");
            System.out.println("Silnik odpala");
            System.out.println("Chodzi na wolnych obrotach");
        }
    }
    @Override
    public void Sale(Human seller, Human buyer, Double price) {
        if (buyer.cash < price){
            System.out.println("SORRY, NIE MASZ KASY");
        } else if (seller.car != this){
            System.out.println("SORRY, NIE MASZ SAMOCHODU");
        } else{
            seller.cash += price;
            buyer.cash -= price;
            seller.car = null;
            buyer.car = this;
            System.out.println("Udalo sie sprzedac samochód za " + price + " pln");
        }
    }

    public String toString(){
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineVolume=" + engineVolume +
                ", plates=" + plates +
                ", value='" + value + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

    @Override
    public void turnOn() {


    }
}

