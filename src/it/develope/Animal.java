package it.develope;

public class Animal {
    String animalName;

    public Animal(String animalName){
        this.animalName = animalName;
    }

    public void animalSound(){
        System.out.println("Roarr!");
    }

    public void animalSound(String intensity){
        if(intensity == "High"){
            System.out.println("Roarrrrrrrr!");
        }
        else if (intensity == "Low") {
            System.out.println("Roar");
        }
        else{
            System.out.println("Cannot reproduce it properly");
        }
    }
}
