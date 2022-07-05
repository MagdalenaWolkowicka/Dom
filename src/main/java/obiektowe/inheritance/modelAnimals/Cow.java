package obiektowe.inheritance.modelAnimals;

public class Cow extends Animal {

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
