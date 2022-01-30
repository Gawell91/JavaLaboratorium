package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Human student = new Human("Gaweł", "Grabowski", 30);
        Human teacher = new Human("Adam", "Małysz", 45);
        Car Subaru = new Car("Subaru", "Legacy", 2005,"Black");
        Car AlfaRomeo = new Car("Alfa Romeo", "Giulia", 2020, "Black");
        Phone iphone = new Phone("Apple", "iphone", 2019, 5.3, 8);
        Phone samsung = new Phone("Samsung", "Galaxy", 2019, 6.0, 6);
        Animal cat = new Animal("cat");
        Animal dog = new Animal("dog");
        System.out.println(Subaru);
        System.out.println(AlfaRomeo);
        System.out.println("------------------------------------------");
        System.out.println(student);
        System.out.println(teacher);
        System.out.println("------------------------------------------");
        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println("------------------------------------------");
        System.out.println(cat);
        System.out.println(dog);
        System.out.println("------------------------------------------");
        iphone.turnOn();
        System.out.println("------------------------------------------");
        samsung.turnOn();
        System.out.println("------------------------------------------");
        Subaru.turnOn();
        System.out.println("------------------------------------------");
        AlfaRomeo.turnOn();
    }
}