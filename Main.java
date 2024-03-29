package com.milewskiarkadiuszmodul8.asmilewskiModul11;

public class Main {
    public static void main( String[] args) {

        Dog dog1 = new Dog(20, 6.0, "Labrador");
        Dog dog2 = new Dog(5, 4.0, "Chihuahua");
        Fish fish1 = new Fish(45.56, 1);
        Fish fish2 = new Fish(23, 3);
        Animal animal1 = new Animal(AnimalSize.BIG, 50.0);
        Animal animal2 = new Animal(AnimalSize.MEDIUM, 15.0);


        Animal[] animals = {dog1, dog2, fish1, fish2, animal1, animal2};

        // Tworzenie obiektu klasy Zoo
        Zoo zoo = new Zoo(animals);

        // Testowanie polimorfizmu
        zoo.testAllAnimals();
    }



}
