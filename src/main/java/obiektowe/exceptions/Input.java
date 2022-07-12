package obiektowe.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {



    public int readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = 0;
        try {
             number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Należy podać liczbę");
            return readNumber();
        } finally {
            System.out.println("Blok finalny");
        }
        return number;
    }
}



