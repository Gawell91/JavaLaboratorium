package com.company;

public class Main {

    public static void main(String[] args) {
        Human student = new Human("Gaweł", "Grabowski", 30);
        Human teacher = new Human("Adam", "Małysz", 45);
        Car Subaru = new Car("Legacy", "Subaru", "Black","2005");
        Subaru.value = 100.00;
        student.setSalary(0.0);
        student.setCar(Subaru);
        System.out.println("---------------------------------------------------");
        student.setSalary(50.0);
        student.setCar(Subaru);
        System.out.println("---------------------------------------------------");
        student.setSalary(200.0);
        student.setCar(Subaru);
    }
}