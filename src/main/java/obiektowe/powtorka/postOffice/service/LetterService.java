package obiektowe.powtorka.postOffice.service;

import obiektowe.powtorka.postOffice.model.Letter;
import obiektowe.powtorka.postOffice.model.Person;
import obiektowe.powtorka.postOffice.model.Status;

import java.util.ArrayList;
import java.util.List;

public class LetterService implements Countable, Visible {

    private List<Letter> acceptedLetters = new ArrayList<>();
    private List<Letter> allLetters = new ArrayList<>();

    public void sendLetter() {
        if (acceptedLetters.size() < 10) {
            PostOffice postOffice = new PostOffice();
            Letter letter = createLetter();
            double price = countPrice();
            double money = postOffice.pay(price);
            if (money < price) {
                System.out.println("Wysyłka kosztuje " + price + " zł.");
                System.out.println("Za mało kasy, nie udało się wysłać");
                allLetters.add(letter);
                return;
            } else if (money == price) {
                letter.setStatus(Status.ACCEPTED);
                System.out.println("Paczka wysłana ;)");
            } else {
                letter.setStatus(Status.ACCEPTED);
                double restOfMoney = money - price;
                System.out.println("Wydaję " + restOfMoney + " zł reszty.");
            }
            if (letter.getStatus().equals(Status.ACCEPTED)) {
                postOffice.increaseTakings(price);
                acceptedLetters.add(letter);
            }
            allLetters.add(letter);
        } else {
            System.out.println("Skrzynka pocztowa pełna, wyślij listonosza!");
        }
    }


    private Letter createLetter() {
        PostOffice postOffice = new PostOffice();
        List<Person> people = postOffice.askPersonInfo();
        //boolean priority = postOffice.isPriority();
        return new Letter(people.get(0), people.get(1), postOffice.isPriority());
    }

    @Override
    public double countPrice() {
        double price = 0;
        PostOffice postOffice = new PostOffice();
        //boolean priority = postOffice.isPriority();
        if (postOffice.isPriority()) {
            price = 8.5;
        } else {
            price = 6;
        }
        return  price;
    }

    @Override
    public void displayAll() {
        PostOffice postOffice = new PostOffice();
        if (!allLetters.isEmpty()) {
            for (Letter allLetter : allLetters) {
                System.out.println(allLetter);
            }
        } else {
            postOffice.printNoDataToDisplay();
        }
    }

    public void displayAcceptedLetters() {
        PostOffice postOffice = new PostOffice();
        if (!acceptedLetters.isEmpty()) {
            for (Letter acceptedLetter : acceptedLetters) {
                System.out.println(acceptedLetter);
            }
        } else {
            postOffice.printNoDataToDisplay();
        }
    }

    public void sendPostman() {
        if (!acceptedLetters.isEmpty()) {
            acceptedLetters.clear();
            for (Letter allLetter : allLetters) {
                if (allLetter.getStatus().equals(Status.ACCEPTED)) {
                    allLetter.setStatus(Status.SENT);
                }
            }
        }
    }
}
