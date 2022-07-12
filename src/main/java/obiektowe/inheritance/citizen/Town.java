package obiektowe.inheritance.citizen;

import obiektowe.inheritance.citizen.model.*;

import java.util.ArrayList;
import java.util.List;

public class Town {

    List<Citizen> citizensList = new ArrayList<>();

    public void add(Citizen citizen) {
        citizensList.add(citizen);
    }

    public int howManyCanVote() {
        int count = 0;
        for (Citizen citizen : citizensList) {
            if (citizen.canVote()) {
                count++;
            }
        }
        return count;
    }

    public List<Citizen> getCitizensList() {
        return citizensList;
    }

    public void whoCanVote() {
        for (Citizen citizen : citizensList) {
            if (citizen.canVote()) {
                System.out.println(citizen.getName());
            }
        }
    }

}
