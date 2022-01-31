package com.company;

import com.company.creatures.Human;
import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.LPG;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Diesel VW = new Diesel("VW", "Passat", 2020, "Silver");
        Electric tesla = new Electric("Tesla", "X", 2020, "Silver");
        LPG Dacia = new LPG("Dacia", "Sandero", 2021, "Silver");
        Phone iphone = new Phone("Apple", "ios", 2020, 5.3, 8);
        VW.value = 10000.00;
        tesla.value = 100000.00;
        Dacia.value = 1000.0;

        Human student = new Human();
        Human teacher = new Human();
        Human dziekan = new Human();

        student.addCar(VW);
        student.addCar(tesla);
        student.addCar(Dacia);
        student.addCar(VW);
        student.addCar(tesla);
        student.addCar(Dacia);
        student.addCar(VW);
        student.addCar(tesla);
        student.addCar(Dacia);
        student.addCar(Dacia);
        student.addCar(tesla);
        student.addCar(Dacia);
        student.addCar(VW);
        student.addCar(tesla);
        student.addCar(Dacia);
        student.removeCar(tesla);
        System.out.println(student.hasCar(VW));
        System.out.println(student.getGarageValue());
        teacher.addCar(Dacia);
        teacher.addCar(tesla);
        teacher.addCar(VW);
        System.out.println("----------------------------------");
        Dacia.Sale(student, teacher, 10.0);
        System.out.println("----------------------------------");
        teacher.cash = 10.0;
        System.out.println("Ilosc pieniedzy w portfelu przed kupnem nauczyciel " + teacher.cash);
        System.out.println("Ilosc pieniedzy w portfelu przed kupnem student " + student.cash);
        VW.Sale(student,teacher,10.0);
        System.out.println("Ilosc pieniedzy w portfelu po zakupie nauczyciel " + teacher.cash);
        System.out.println("Ilosc pieniedzy w portfelu po zakupie student " + student.cash);
        System.out.println("----------------------------------");
        VW.Sale(dziekan, student, 10.0);
        System.out.println("----------------------------------");
        student.cash = 1000.0;
        VW.Sale(teacher, student, 10.0);
        System.out.println("----------------------------------");
        dziekan.cash = 10000.0;
        VW.Sale(student, dziekan, 10.0);
    }
}