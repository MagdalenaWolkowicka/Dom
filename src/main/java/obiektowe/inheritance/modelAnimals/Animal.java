package obiektowe.inheritance.modelAnimals;


public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal 2");
    }

    public Animal() {
        System.out.println("AnimAL 1");
    }

    public void eat() {
        System.out.println("Zwierzę je jedzonko ;)");
    }

    public abstract void makeSound(); // metoda abstrakcyjna nie ma ciała i trzeba ją nadpisywać!

}
