package com.hw.animals;

import java.util.HashSet;
import java.util.Set;

public class Cat extends Animal {
    public static Set createCats(){
        HashSet<Cat> res = new HashSet<>();
        for (int i = 0; i < 4; i++) {
           res.add(new Cat());
        }
        return res;
    }
    public static void removeCats(Set anims,Set<Cat> cats){
        anims.removeAll(cats);
    }
    @Override
    public void print(){
        System.out.println("cat");
    }

}
