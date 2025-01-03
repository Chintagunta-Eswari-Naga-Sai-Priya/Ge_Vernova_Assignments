package Day7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Card {
    private String suit;
    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

class DeckOfCards {
    private List<Card> deck;

    public DeckOfCards() {
        deck = new ArrayList<>();
        String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public void distributeCards() {
        List<List<Card>> players = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            players.add(new ArrayList<>());
        }

        for (int i = 0; i < 36; i++) {
            players.get(i % 4).add(deck.get(i));
        }

        for (int i = 0; i < players.size(); i++) {
            System.out.println("Player " + (i + 1) + "'s Cards:");
            for (Card card : players.get(i)) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}

public class DeckOfCardsManagement {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        deck.distributeCards();
    }
}
