package obiektowe.inheritance.animals.modelAnimals;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

    public void goToSleep() {
        System.out.println("Zwierzę idzie spać...");
    }

    public abstract void makeSound();
}
