package obiektowe.enums.card;

import java.util.ArrayList;
import java.util.List;

public class CardService {

    public CardService() {
    }

    public void compareCards(Card card1, Card card2) {
        if (card1.getRankNumber() > card2.getRankNumber()) {
            System.out.println(card1);
        } else if (card1.getRankNumber() == card2.getRankNumber()) {
            System.out.println(card1);
            System.out.println(card2);
            System.out.println("Karty są równe");
        } else {
            System.out.println(card2);
        }

    }

    public List<Card> createSpadeCards() {
        ArrayList<Card> pikCardsList = new ArrayList<>();
        for (Rank value : Rank.values()) {
            pikCardsList.add(new Card(Suit.SPADE, value));
        }
        return pikCardsList;
    }

    public ArrayList<Card> createDeck() {
        ArrayList<Card> cardsList = new ArrayList<>();
        for (Suit suitValue : Suit.values()) {
            for (Rank value : Rank.values()) {
                cardsList.add(new Card(suitValue, value));
            }
        }
        return cardsList;
    }


}
