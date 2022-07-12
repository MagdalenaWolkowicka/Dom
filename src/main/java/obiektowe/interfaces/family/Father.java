package obiektowe.interfaces.family;

public class Father implements FamilyMember {

    private String name;

    public Father(String name) {
        this.name = name;
    }

    public Father() {
    }

    @Override
    public void przedstwaSie() {
        System.out.println("I'm father " + name);
    }

    @Override
    public boolean jestDorosly() {
        return true;
    }
}
