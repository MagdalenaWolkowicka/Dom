package obiektowe.inheritance.citizen;

import obiektowe.inheritance.citizen.model.*;

import java.util.ArrayList;
import java.util.List;

public class Town {

    List<Citizen> citizensList = new ArrayList<>();

    public void add(Citizen citizen) {
        citizensList.add(citizen);
    }

    public static int howManyCanVote(List<Citizen> list) {
        int count = 0;
        for (Citizen citizen : list) {
            if (citizen.canVote()) {
                count++;
            }
        }
        return count;
    }

    public List<Citizen> getCitizensList() {
        return citizensList;
    }

    public static void whoCanVote(List<Citizen> list) {
        for (Citizen citizen : list) {
            if (citizen.canVote()) {
                System.out.println(citizen.getName());
            }
        }
    }

}
