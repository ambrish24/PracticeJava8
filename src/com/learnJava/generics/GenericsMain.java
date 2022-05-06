package com.learnJava.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsMain {

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<Dog>(); // ArrayList implements List
        //List<Animal> animals = dogs; // Not Valid
        List<? extends Animal> animals = dogs;
        List<Animal> animals1 = new ArrayList<>();
        animals1.add(new Cat());
        Dog dog = dogs.get(0);
    }
}
