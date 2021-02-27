package com.hw.animals;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

abstract class Animal {
    public static Set join(Set dogs, Set cats){
        HashSet anims = new HashSet(dogs);
        anims.addAll(cats);
        return anims;
    }


    public abstract void print();
}
