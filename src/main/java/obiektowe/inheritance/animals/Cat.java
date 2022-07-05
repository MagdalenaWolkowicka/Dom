package obiektowe.inheritance.animals;

public class Cat extends Animal{
    private String name;
    private int age;
    private String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void mrr() {
        System.out.println(name + " Kot mruczy");
    }

    public void goToSleep() {
        System.out.println(name + " kot śpi... Mrrrrr");
    }


}
