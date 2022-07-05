package obiektowe.inheritance;

public class Monkey extends Animal{
    private String name;
    private int age;
    private int taleLength;

    public Monkey(String name, int age, int taleLength) {
        this.name = name;
        this.age = age;
        this.taleLength = taleLength;
    }

    public Monkey() {
        name = "Jacek";
        age = 8;
        taleLength = 20;

    }

    public void uhaha() {
        System.out.println(name + " robi uhahaha!!!");
    }

    public void jump() {
        System.out.println(name + " skacze w poszukiwaniu banana!");
    }

    public void eat() {
        System.out.println("Małpa je banana!");
    }
}
