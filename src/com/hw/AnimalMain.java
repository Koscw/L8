package com.hw;

import java.util.Set;
import static com.hw.Animal.join;


import static com.hw.Cat.createCats;
import static com.hw.Cat.removeCats;
import static com.hw.Dog.createDog;
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
