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
        Animal homoSapiens = new Animal("homo sapiens");
        cat.Sale(student, teacher, 10.0);
        System.out.println("-----------------------------------------");
        student.pet = cat;
        cat.Sale(student, teacher, 10.0);
        System.out.println("-----------------------------------------");
        teacher.cash = 10.0;
        System.out.println("Pieniadze w portfelu nauczyciela przed kupnem: " + teacher.cash);
        System.out.println("Pieniadze w portfelu studenta przed sprzedaza: " + student.cash);
        cat.Sale(student, teacher, 10.0);
        System.out.println("Pieniadze w portfelu nauczyciela po zakupie: " + teacher.cash);
        System.out.println("Pieniadze w portfelu studenta po sprzedazy: " + student.cash);
        System.out.println("-----------------------------------------");
        iphone.Sale(student, teacher, 100.0);
        System.out.println("-----------------------------------------");
        student.mobile = iphone;
        iphone.Sale(student, teacher, 100.0);
        System.out.println("-----------------------------------------");
        teacher.cash = 100.0;
        System.out.println("Pieniadze w portfelu nauczyciela przed kupnem: " + teacher.cash);
        System.out.println("Pieniadze w portfelu studenta przed sprzedaza: " + student.cash);
        iphone.Sale(student, teacher, 100.0);
        System.out.println("Pieniadze w portfelu nauczyciela po zakupie: " + teacher.cash);
        System.out.println("Pieniadze w portfelu studenta po sprzedazy: " + student.cash);
        System.out.println("-----------------------------------------");
        Subaru.Sale(student, teacher, 1000.0);
        System.out.println("-----------------------------------------");
        student.car = Subaru;
        Subaru.Sale(student, teacher, 1000.0);
        System.out.println("-----------------------------------------");
        teacher.cash = 1000.0;
        System.out.println("Pieniadze w portfelu nauczyciela przed kupnem: " + teacher.cash);
        System.out.println("Pieniadze w portfelu studenta przed sprzedaza: " + student.cash);
        Subaru.Sale(student, teacher, 1000.0);
        System.out.println("Pieniadze w portfelu nauczyciela po zakupie: " + teacher.cash);
        System.out.println("Pieniadze w portfelu studenta po sprzedazy: " + student.cash);
        System.out.println("-----------------------------------------");
        homoSapiens.Sale(student, teacher, 10000.0);
        System.out.println("-----------------------------------------");
        teacher.cash = 10000.0;
        homoSapiens.Sale(student, teacher, 10000.0);
        System.out.println("-----------------------------------------");
        student.pet = homoSapiens;
        homoSapiens.Sale(student, teacher, 10000.0);

    }
}