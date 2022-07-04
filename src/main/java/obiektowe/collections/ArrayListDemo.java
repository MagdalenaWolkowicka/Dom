package obiektowe.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        String[] names = new String[3];
        names[0] = "Marcin";
        names[1] = "Julia";
        names[2] = "Ada";

        ArrayList<String> namesList = new ArrayList<>();
        System.out.println(namesList);
        System.out.println(namesList.size());
        namesList.add("Marcin");
        namesList.add("Julia");
        namesList.add("Ada");
        System.out.println(namesList);
        System.out.println(namesList.size());

        namesList.add(0, "Grzegorz");
        System.out.println(namesList);

        String element = namesList.get(0);
        System.out.println(element);

        namesList.set(1, "Zofia");
        System.out.println(namesList);
        namesList.add("Grzegorz");

        namesList.remove("Grzegorz");
        System.out.println(namesList);
        System.out.println();

        //int = Integer
        //char = Character
        //double = Double

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(8);
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.contains(8));
        int number = numbers.get(1);
        System.out.println(number);
        numbers.remove(0);
        for (Integer integer : numbers) {
            System.out.print(integer + " ");
        }
        System.out.println("");
        int number2 = numbers.get(0);
        System.out.println(number2);

        ArrayList <Object> objects = new ArrayList<>(); // ale to niewygodne, zawsze trzeba podać typ!
        objects.add("rff");
        objects.add(4);
        objects.add("ffd");
        objects.add(8);
        System.out.println("");

        ArrayList<String> newNameList = (ArrayList<String>) namesList.clone();
        System.out.println(newNameList);

       List<String> listList =  new ArrayList<> (List.of("Lola", "Hela", "Zula"));
        System.out.println(listList);



    }
}
