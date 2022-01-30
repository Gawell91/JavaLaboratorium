package com.company;

import devices.Car;
import devices.Phone;
public class Main {

    public static void main(String[] args) {
        Human student = new Human("Gaweł", "Grabowski", 30);
        Human teacher = new Human("Adam", "Małysz", 45);
        Car Subaru = new Car("Legacy", "Subaru", "Black",2005);
        Car AlfaRomeo = new Car("Alfa", "Romeo", "Black", 2020);
        Phone iphone = new Phone("Iphone", 5.3, "ios", "White", 8);
        Phone samsung = new Phone("Samsung", 6.0, "Android", "Black", 6);
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
    }
}