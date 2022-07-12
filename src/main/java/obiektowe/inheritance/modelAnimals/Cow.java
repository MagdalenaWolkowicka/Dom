package obiektowe.inheritance.modelAnimals;

import obiektowe.interfaces.FarmAnimals;
import obiektowe.interfaces.LandCreature;

public class Cow extends Animal implements FarmAnimals, LandCreature {

    public Cow(String name, int age) {
        super(name, age);
    }

    public Cow() {
    }

    @Override
    public void makeSound() {
        System.out.println("Muuu!");
    }
}
