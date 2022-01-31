package com.company;

public class Animal implements Salleable{
    private static final Double DEFAULT_CAT_WEIGHT = 4.0;
    private static final Double DEFAULT_DOG_WEIGHT = 7.0;
    private static final Double DEFAULT_WEIGHT = 1.0;
    private Double weight;
    final String species;
    Boolean isAlive;
    public Animal(String species){
        this.isAlive = true;
        this.species = species;
        if(this.species.equals("cat")){
            this.weight = DEFAULT_CAT_WEIGHT;
        }else if(this.species.equals("dog")){
            this.weight = DEFAULT_DOG_WEIGHT;
        }else{
            this.weight = DEFAULT_WEIGHT;
        }
    }
    public void feed(){
        if(this.weight > 0.0){
            this.isAlive = true;
            this.weight += 1.0;
            System.out.println("Dzięki za jedzienie!");
        }else{
            System.out.println("Jestem niezywy, nie mozna mnie juz karmnic, co ty robisz, dzwon po ksiedza!");
        }
    }
    public void takeForAWalk(){
        if(this.isAlive){
            this.weight -= 1.0;
            System.out.println("Dzieki za spacer!");
            if(this.weight == 0 ){
                this.isAlive = false;
            }
        }else{
            System.out.println("Jestem niezywy, nie mozna mnie juz brac na spacer, dzwon po ksiedza!");
        }
    }
    @Override
    public void Sale(Human seller, Human buyer, Double price) {
        if (buyer.cash < price){
            System.out.println("SORRY, NIE MASZ KASY");
        } else if (seller.pet != this){
            System.out.println("SORRY, NIE MASZ TAKIEGO ZWIERZECIA");
        } else if(seller.pet.species.equals("homo sapiens")){
            System.out.println("NIE MOZNA HANDLOWAC LUDZMI");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.pet = null;
            buyer.pet = this;
            System.out.println("Udalo sie sprzedac zwierze za " + price + " pln");
        }
    }

    public String toString(){
        return  "Gatunek: " + species + " waga: " + weight + " kg";
    }
}