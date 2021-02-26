package com.hw;

import java.util.HashSet;
import java.util.Set;

public class Dog extends Animal {
    public static Set createDog(){
        HashSet<Dog> res = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            res.add(new Dog());
        }
        return res;
    }
    @Override
    public void print(){
        System.out.println("dog");
    }

}
