package obiektowe.inheritance.animals.modelAnimals;

import obiektowe.inheritance.animals.modelAnimals.Animal;

public class Cat extends Animal {

    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public Cat(String color) {
        this.color = color;
    }

    public void mrr() {
        System.out.println("Kot mruczy");
    }

    public void goToSleep() {
        System.out.println("Kot śpi... Mrrrrr");
    }

    @Override
    public void makeSound() {
        System.out.println("Miaaau!");
    }


}
