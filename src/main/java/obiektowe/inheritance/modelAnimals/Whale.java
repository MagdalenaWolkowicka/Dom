package obiektowe.inheritance.modelAnimals;

public class Whale extends Animal {

    private double weight;

    public Whale(String name, int age, double weight) {
        super(name, age);
        this.weight = weight;
    }

    public Whale() {
        super("Kraken", 60);
        weight = 0.5;
    }

    public void booing() {
        System.out.println(name + " wieloryb robi buuuuuu!");
    }

    public void swim() {
        System.out.println(name + " płynie majestatycznie...");
    }

    public void eat() {
        super.eat();
        System.out.println("Czyli je plankton");
    }

    public void goToSleep() {
        System.out.println("Słoń śpi");
    }

    @Override
    public void makeSound() {
        booing();
    }
}
