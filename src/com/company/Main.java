package com.company;

public class Main {

    public static void main(String[] args) {
        Human student = new Human("Gaweł", "Grabowski", 30);
        Human teacher = new Human("Adam", "Małysz", 45);
        System.out.println("---------------------------------------------");
        student.setSalary(0.0);
        System.out.println("---------------------------------------------");
        System.out.println(student.getSalary());
        System.out.println("---------------------------------------------");
        student.setSalary(-1.0);
        System.out.println("---------------------------------------------");
        System.out.println(student.getSalary());
        System.out.println("---------------------------------------------");
        student.setSalary(100.0);
        System.out.println("---------------------------------------------");
        System.out.println(student.getSalary());
    }
}