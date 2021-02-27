package com.hw.animals;

import java.util.Set;
import static com.hw.animals.Animal.join;


import static com.hw.animals.Cat.createCats;
import static com.hw.animals.Cat.removeCats;
import static com.hw.animals.Dog.createDog;
public class AnimalMain {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDog();
        Set<Animal> animals = join(dogs, cats);
        for (Animal an : animals) {
            an.print();
        }
        System.out.println("/////////////////////////");
        removeCats(animals,cats);
        for (Animal an : animals) {
            an.print();
        }

    }
}
