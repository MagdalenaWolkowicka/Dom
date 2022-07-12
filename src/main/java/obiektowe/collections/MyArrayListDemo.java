package obiektowe.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayListDemo {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        // Jest lepsza jesli czesto potrzeba dostawać się do konkretnych elementów

        //[0][0][0]
        //add(10)
        //[10][0][0]
        //add(20)
        //[10][20][0]
        //add(30)
        //[10][20][30]
        //add(35)
        //[10][20][30][35][0][0]
        // list1.add(0,7);
        //[10][20][30] {[35][35]} [0]
        //[10][20] {[30][30]} [35][0]
        //[10] {[20][20]} [30][35][0]
        // {[10][10]} [20][30][35][0]
        // {[7]} [10][20][30][35][0]

        List<Integer> list2 = new LinkedList<>();
        //clinked lista jest lepsza dla duzej ilosci danych, kiedy bedziemy chcieli dodawac lub usuwac elementy

        //null
        //add(10)
        //([10])>null
        //add(20)
        // ([20]) (tworzy nowy element łańcucha)
        //([10])>([20])>null (odnajduje ostatni element i ustawia mu, ten nowy jako jego następny)
        //add(30)
        // ([30]) (tworzy nowy element łańcucha)
        //([10])>([20])>([30])>null (odnajduje ostatni element i ustawia mu, ten nowy jako jego następny)
        //add(35)
        // ([35]) (tworzy nowy element łańcucha)
        //([10])>([20])>([30])>([35])>null

        // list1.add(1,7);
        //([10])>([20])>([30])>([35])>null  //Odnajdujemy odpowiednie miejsce (pozycja 1 czyli element z 20)
        //([7])>null tworzymy nowy element łańcucha
        // ([7])>([20])>([30])>([35])>null     ustawiamy że nowy element wskazuje na ten na indexie 1
        // ([10])>([7])>([20])>([30])>([35])>null   przestawiamy że 10 wskazuje na 7

        MyContener<Integer> integerMyContener = new MyContener<>();
        integerMyContener.setData(10);
        System.out.println(integerMyContener.getData());

        MyContener<String > stringMyContener = new MyContener<>();
        stringMyContener.setData("ddd");
        System.out.println(stringMyContener.getData());

        System.out.println(" ");

        List <Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(4);
        list.remove(1);
        for (Integer integer : list) {
            System.out.println(integer);
        }

        System.out.println(list.get(2));





    }
}