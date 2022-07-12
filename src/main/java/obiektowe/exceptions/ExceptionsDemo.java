package obiektowe.exceptions;

import java.util.Locale;

public class ExceptionsDemo {

    public static void main(String[] args) {

        System.out.println("Start");
        String text = null;

        try {
           // String newText = text.toLowerCase(Locale.ROOT);
            //System.out.println(text.charAt(100));
            System.out.println(10 / 0);

        } catch (NullPointerException e) {
            System.out.println("OOO nullPointer!");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Out");
        } catch (Exception e) {
            System.out.println("Jakiś nieprzewidziany wyjątek");
            e.getMessage();
            e.printStackTrace();
        } finally {
            System.out.println("Udało się");
        }

        System.out.println("Koniec");

    }
}
