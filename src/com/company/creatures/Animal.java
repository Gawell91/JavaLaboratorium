package com.company.creatures;

import com.company.Salleable;

public abstract class Animal implements Salleable,Feedable {
    private static final Double DEFAULT_CAT_WEIGHT = 4.0;
    private static final Double DEFAULT_DOG_WEIGHT = 7.0;
    private static final Double DEFAULT_WEIGHT = 1.0;
    private static final Double DEFAULT_FOOD_WEIGHT = 0.0;
    final String species;
    private Double weight;
    public boolean isAlive;

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
        this.feed(DEFAULT_FOOD_WEIGHT);
        System.out.println("Zwierze zostalo nakarmione, jedna porcja");
}
    public void takeForAWalk(){
        if(this.isAlive){
            this.weight -= 1.0;
            System.out.println("Dzieki za spacer!");
            if(this.weight == 0 ){
                this.isAlive = false;
            }
        }
        else {
            System.out.println("Jestem niezywy, nie mozna mnie juz brac na spacer, dzwon po ksiedza!");
        }
        public void feed(Double foodWeight){

            if (this.isAlive) {
                this.weight += foodWeight;
                System.out.println("thx for food bro, ");
                System.out.println("Zwierze zostalo nakarmione, " + foodWeight + "kg");
                }
            else
            {
                    System.out.println("too late sorry");
            }
        }
    }
}