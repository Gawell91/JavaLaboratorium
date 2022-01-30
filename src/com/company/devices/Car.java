package com.company.devices;

public class Car extends Device {
    public Double engineVolume;

    public String plates;
    public Double value;
    public Car(String producer, String model, Integer yearOfProduction, String colour) {
        super(producer, model, yearOfProduction, colour);
        this.engineVolume = 2.0;
        this.value = 0.0;
        this.plates = "CBR 18MX";
        @Override
        public void (){
            System.out.println("Przekrecam kluczyk");
            System.out.println("Silnik odpala");
            System.out.println("Chodzi na wolnych obrotach");
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
}

