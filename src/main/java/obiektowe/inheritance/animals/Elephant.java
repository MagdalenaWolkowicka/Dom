package obiektowe.inheritance.animals;

public class Elephant extends Animal{
    private String name;
    private int age;
    private double trunkLength;

    public Elephant(String name, int age, double trunkLength) {
        this.name = name;
        this.age = age;
        this.trunkLength = trunkLength;
    }

    public void szuuu() {
        System.out.println(name + " słoń oblewa się wodą");
    }
}
