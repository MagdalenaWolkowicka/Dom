package obiektowe.inheritance.citizen;

import obiektowe.inheritance.citizen.model.*;

import java.util.ArrayList;
import java.util.List;

public class Town {

    public static int howManyCanVote(List<Citizen> list) {
        int count = 0;
        for (Citizen citizen : list) {
            if (citizen.canVote()) {
                count++;
            }
        }
        return count;
    }

    public static void whoCanVote(List<Citizen> list) {
        for (Citizen citizen : list) {
            if (citizen.canVote()) {
                System.out.println(citizen.getName());
            }
        }

    }

    public static void main(String[] args) {

        King king = new King("Tadek król");
        Soldier soldier = new Soldier("Romek żołnierz");
        TownsMan townsMan = new TownsMan("Felek mieszczuch");
        Peasant peasant = new Peasant("Zbychu wiesniak");

        List<Citizen> citizensList = new ArrayList<>();
        citizensList.add(king);
        citizensList.add(soldier);
        citizensList.add(townsMan);
        citizensList.add(peasant);

        int number = howManyCanVote(citizensList);
        System.out.println(number);

        whoCanVote(citizensList);


    }
}
