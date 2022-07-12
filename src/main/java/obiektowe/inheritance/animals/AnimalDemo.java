package obiektowe.inheritance.animals;

import obiektowe.inheritance.animals.modelAnimals.Animal;
import obiektowe.inheritance.animals.modelAnimals.Cat;
import obiektowe.inheritance.animals.modelAnimals.Elephant;

import java.util.ArrayList;
import java.util.List;

public class AnimalDemo {

    public static void main(String[] args) {


        Cat cat1 = new Cat("Mruczek", 5, "biały");
        Cat cat2 = new Cat("Puszek", 7, "czarny");
        Elephant elephant1 = new Elephant("Hugo", 30, 6);
        Elephant elephant2 = new Elephant("Marcel", 12, 7);

        List <Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(cat2);
        animals.add(elephant1);
        animals.add(elephant1);

        for (Animal animal : animals) {
            animal.makeSound();
            animal.goToSleep();
        }


    }
}
