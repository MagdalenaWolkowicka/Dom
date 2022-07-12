package obiektowe.interfaces.family;

public interface FamilyMember {

    default void przedstwaSie() {
        System.out.println("Jestem członkiem");
    }

    boolean jestDorosly();
}
