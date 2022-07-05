package obiektowe.inheritance;

import obiektowe.inheritance.modelAnimals.Animal;
import obiektowe.inheritance.modelAnimals.Cow;
import obiektowe.inheritance.modelAnimals.Monkey;
import obiektowe.inheritance.modelAnimals.Whale;

public class AnimalsDemo {
    public static void main(String[] args) {

        Monkey monkey = new Monkey();
        Monkey monkey1 = new Monkey("Filutek", 4, 15);

        Whale whale = new Whale();
        Whale whale1 = new Whale("Radek", 45, 7);

        monkey.jump();
        monkey.uhaha();

        whale.booing();
        whale.swim();

        // wspolna metoda
        monkey.eat();
        whale.eat();

        System.out.println("");
        AnimalGuide animalGuide = new AnimalGuide();
        animalGuide.feedAnimal(monkey);  // polimorfizm
        animalGuide.feedAnimal(whale);
        System.out.println("");

        // polimorfizm

        Animal animal = new Whale();
        animal.makeSound();
        animal = new Monkey();
        animal.makeSound();
        animal = new Cow();
        animal.makeSound();
        // zdolność języka obiektowego do umieszczania we wspólnej zmiennej różnych typów obiektów
        // metody takiej zmiennej dostosowują działanie w zależności jaki obiekt nadpisują
        // z abstrakcyjnej klasy nie można robić obiektów
        //metody abstrakcyjne trzeba nadpisywać!

        //private - tylko w danej klasie
        //default - w pakiecie
        //protected - w pakiecie i w klasach dziedziczących poza pakietem
        //public - klasy z każdego pakietu

    }
}
