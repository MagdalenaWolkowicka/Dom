package obiektowe.interfaces.family;

import java.util.ArrayList;
import java.util.List;

public class FamilyDemo {

    public static void main(String[] args) {

        Mother mother = new Mother("Ola");
        Father father = new Father("Darek");
        Son son = new Son("Rysio");
        Daughter daughter = new Daughter("Fela");

        List <FamilyMember> list = new ArrayList<>();
        list.add(mother);
        list.add(father);
        list.add(son);
        list.add(daughter);

        for (FamilyMember familyMember : list) {
            familyMember.przedstwaSie();
            System.out.println(familyMember.jestDorosly());
        }

    }
}
