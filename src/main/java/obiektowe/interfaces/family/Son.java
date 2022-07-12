package obiektowe.interfaces.family;

public class Son implements FamilyMember {

    private String name;

    public Son(String name) {
        this.name = name;
    }

    public Son() {
    }

    @Override
    public void przedstwaSie() {
        System.out.println("I'm son " + name);
    }

    @Override
    public boolean jestDorosly() {
        return false;
    }
}
