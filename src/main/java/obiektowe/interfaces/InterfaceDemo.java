package obiektowe.interfaces;

import obiektowe.inheritance.point.Line;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class InterfaceDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        Queue<String> list1 = new LinkedList<>();
        list1.add("aa");
        list1.add("bb");
        list1.add("cc");
        System.out.println(list1.remove(1));
    }
}
