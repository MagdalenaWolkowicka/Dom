package obiektowe.inheritance;

import obiektowe.inheritance.modelAnimals.Animal;
import obiektowe.interfaces.FarmAnimals;

public class AnimalGuide {

    public void feedAnimal(FarmAnimals animal) {
        System.out.println("Opiekun karmi zwierzę");
        animal.eat();
        animal.makeSound();





        //animal.uhaha();
//        if (animal instanceof Monkey) {
//            Monkey monkey = (Monkey) animal;
//            monkey.uhaha();
//        } else if (animal instanceof Whale) {
//            Whale whale = (Whale) animal;
//            whale.booing();
//        }
    }
}
