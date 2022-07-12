package obiektowe.exceptions;

public class InputDemo {

    public static void main(String[] args) {

        Input input = new Input();
        int number = input.readNumber();
        System.out.println("Podano " + number);

    }
}
