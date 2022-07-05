package obiektowe.inheritance.citizen.model;

public class King extends Citizen {


    public King(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return false;
    }
}
