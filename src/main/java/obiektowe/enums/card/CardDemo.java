package obiektowe.enums.card;

import java.util.ArrayList;
import java.util.List;

public class CardDemo {

    public static void main(String[] args) {

        Card card1 = new Card(Suit.DIAMOND, Rank.QUEEN);
        Card card2 = new Card(Suit.HEART, Rank.KING);

        System.out.println(card1);
        System.out.println(card2);

        for (Rank value : Rank.values()) {
            System.out.print(value + " ");
        }
        System.out.println("");

        int numberCard1 = card1.getRankNumber();
        System.out.println(numberCard1);

        CardService cardService = new CardService();
        cardService.compareCards(card1, card2);
        System.out.println("");

        List<Card> cardListPik = cardService.createSpadeCards();
        for (Card card : cardListPik) {
            System.out.println(card);
        }
        System.out.println("");

        ArrayList<Card> cardDeck = cardService.createDeck();
        for (Card card : cardDeck) {
            System.out.println(card);
        }

    }
}
