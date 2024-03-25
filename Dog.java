package com.milewskiarkadiuszmodul8.asmilewskiModul11;

import static com.milewskiarkadiuszmodul8.asmilewskiModul11.AnimalSize.BIG;

public class Dog extends Animal {

    private double barkVolume;
    private String breed;

    public Dog () {
        super(AnimalSize.BIG, 30);
        this.barkVolume = 5.5;
        this.breed = "Labrador";

    }

    // przeciążony konstruktor
    public Dog (double weight, double barkVolume, String breed) {
        super (getSizeFromWeight(weight), weight);
        this.barkVolume = barkVolume;
        this.breed = breed;
        weight = 30.00;

    }

    public static AnimalSize getSizeFromWeight(double weight) {
        if (weight <= 10) {
            return AnimalSize.SMALL;
        } else if (weight <= 25) {
            return AnimalSize.MEDIUM;
        } else {
            return AnimalSize.BIG;
        }
    }

    public double getBarkVolume() {
        return barkVolume;
    }

    public void setBarkVolume(double barkVolume) {
        this.barkVolume = barkVolume;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
