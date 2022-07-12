package obiektowe.interfaces.family;

public class Mother implements FamilyMember {

    private String name;

    public Mother(String name) {
        this.name = name;
    }

    public Mother() {
    }

    @Override
    public void przedstwaSie() {
        System.out.println("I'm mother " + name);
    }

    @Override
    public boolean jestDorosly() {
        return true;
    }
}
