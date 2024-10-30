package extragenerics;

import java.util.ArrayList;
import java.util.List;

public class Examples {
    public static void main(String[] args) {
        // List<? super Dog> list1 = new ArrayList<>();
        // list1.add(new Animal());
        // list1.add(new Dog());
        // list1.add(new Shiba()); 
        // list1 = new ArrayList<Animal>();
        // list1 = new ArrayList<Dog>();
        // list1 = new ArrayList<Shiba>();

        // List<? extends Dog> list1 = new ArrayList<>();
        // list1.add(new Animal());
        // list1.add(new Dog());
        // list1.add(new Shiba()); 
        // list1 = new ArrayList<Animal>();
        // list1 = new ArrayList<Dog>();
        // list1 = new ArrayList<Shiba>();

        // https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
        // https://stackoverflow.com/questions/4343202/difference-between-super-t-and-extends-t-in-java
    }

}

class Animal {}

class Dog extends Animal {}

class Shiba extends Dog {}