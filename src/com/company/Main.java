package com.company;

public class Main {

    public static void main(String[] args) {
        Human student = new Human("Gaweł", "Grabowski", 30);
        Human teacher = new Human("Adam", "Małysz", 45);
        Car Subaru = new Car("Legacy", "Subaru", "Black", 2005);
        Car AlfaRomeo = new Car("Giulia", "Alfa Romeo", "Red", 2021);
        student.car = Subaru;
        teacher.car = AlfaRomeo;
        System.out.println("Imie: " + student.firstName);
        System.out.println("Nazwisko: " + student.lastName);
        System.out.println("Wiek: " + student.age);
        System.out.println("Model samochodu: " + student.car.model);
        System.out.println("Producent samochodu: " + student.car.producer);
        System.out.println("Kolor samochodu: " + student.car.colour);
        System.out.println("Rok produkcji samochodu: " + student.car.yearOfProduction);
        System.out.println("-------------------------------------------------------");
        System.out.println("Imie: " + teacher.firstName);
        System.out.println("Nazwisko: " + teacher.lastName);
        System.out.println("Wiek: " + teacher.age);
        System.out.println("Model samochodu: " + teacher.car.model);
        System.out.println("Producent samochodu: " + teacher.car.producer);
        System.out.println("Kolor smaochodu: " + teacher.car.colour);
        System.out.println("Rok produkcji samochodu: " + teacher.car.yearOfProduction);
    }
}