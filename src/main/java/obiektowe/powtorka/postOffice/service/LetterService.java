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
        PostOffice postOffice = new PostOffice();
        if (acceptedLetters.size() < 10) {
            Letter letter = createLetter();
            double price = countPrice(letter.isPriority());
            double money = postOffice.pay(price);
            if (money < price) {
                postOffice.printShippingCost(price);
                postOffice.printNotEnoughMoney();
                letter.setStatus(Status.DELETED);
                allLetters.add(letter);
                return;
            } else if (money == price) {
                letter.setStatus(Status.ACCEPTED);
                postOffice.printSent();
            } else {
                letter.setStatus(Status.ACCEPTED);
                double restOfMoney = Math.round((money - price) * 100);
                restOfMoney = restOfMoney / 100;
                postOffice.printGiveRestOfMoney(restOfMoney);
            }
            if (letter.getStatus().equals(Status.ACCEPTED)) {
                postOffice.increaseTakings(price);
                acceptedLetters.add(letter);
            }
            allLetters.add(letter);
        } else {
            postOffice.printLetterBoxIsFull();
        }
    }

    private Letter createLetter() {
        PostOffice postOffice = new PostOffice();
        List<Person> people = postOffice.askPersonInfo();
        return new Letter(people.get(0), people.get(1), postOffice.isPriority());
    }

    @Override
    public double countPrice(boolean priority) {
        double price = 0;
        if (priority) {
            price = 8.5;
        } else {
            price = 6;
        }
        return price;
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
