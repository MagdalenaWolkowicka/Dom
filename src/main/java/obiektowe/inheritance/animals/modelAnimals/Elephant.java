package obiektowe.inheritance.animals.modelAnimals;

import obiektowe.inheritance.animals.modelAnimals.Animal;

public class Elephant extends Animal {

    private double trunkLength;

    public Elephant(String name, int age, double trunkLength) {
        super(name, age);
        this.trunkLength = trunkLength;
    }

    public Elephant(double trunkLength) {
        this.trunkLength = trunkLength;
    }

    public void szuuu() {
        System.out.println("Słoń oblewa się wodą");
    }

    @Override
    public void makeSound() {
        System.out.println("Truuuututuuuu!");
    }
}
