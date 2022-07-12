package obiektowe.interfaces.family;

public class Daughter implements FamilyMember {

    private String name;

    public Daughter() {
    }

    public Daughter(String name) {
        this.name = name;
    }

    @Override
    public void przedstwaSie() {
        System.out.println("I'm daughter! " + name);

    }

    @Override
    public boolean jestDorosly() {
        return false;
    }
}
