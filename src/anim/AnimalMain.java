package anim;

import java.util.HashSet;
import java.util.Set;

public class AnimalMain {
    public static void main(String[] args) {
        Set<Animal> animals = new HashSet<>();
        for(Animal an : animals){
            an.print();
        }


        /*
        Set animals2 = new HashSet();
        for (Object an: animals2){      Так не правильно.
            ((Animal) an).print();
        }

         */



    }
}
