package com.company.creatures;

public class FarmAnimal extends Animal implements Edible{
    private double weight;

    public FarmAnimal(String species){
        super(species);
    }

    @Override
    public void beEaten(){
        if(this.isAlive) {
            this.isAlive = false;
            this.weight = 0.0;
            System.out.println(this.species + " zostało zjedzone");
        }
        else
        {
            System.out.println("To zwierze zostalo juz zjedzone");
        }
    }

    @Override
    public void Sale(Human seller, Human buyer, Double price) {

    }

    @Override
    public void feed(Double foodWeight) {

    }
}
