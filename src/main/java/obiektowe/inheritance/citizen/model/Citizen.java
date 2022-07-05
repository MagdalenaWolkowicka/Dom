package obiektowe.inheritance.citizen.model;

public abstract class Citizen {

    String name;

    public Citizen(String name) {
        this.name = name;
    }

    public abstract boolean canVote();

    public String getName() {
        return name;
    }
}
