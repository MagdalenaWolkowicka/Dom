package obiektowe.inheritance.citizen;

import obiektowe.inheritance.citizen.model.King;
import obiektowe.inheritance.citizen.model.Peasant;
import obiektowe.inheritance.citizen.model.Soldier;
import obiektowe.inheritance.citizen.model.TownsMan;

public class CitizenDemo {

    public static void main(String[] args) {
        King king = new King("Tadek król");
        Soldier soldier = new Soldier("Romek żołnierz");
        TownsMan townsMan = new TownsMan("Felek mieszczuch");
        Peasant peasant = new Peasant("Zbychu wiesniak");

        Town town = new Town();
        town.add(king);
        town.add(soldier);
        town.add(townsMan);
        town.add(peasant);

        int number = town.howManyCanVote(town.getCitizensList());
        System.out.println(number);

        town.whoCanVote(town.getCitizensList());
    }
}
