package obiektowe.inheritance.citizen.model;

public class TownsMan extends Citizen{

    public TownsMan(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return true;
    }
}
