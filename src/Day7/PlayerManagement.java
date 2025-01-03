package Day7;

import java.util.*;

class Player {
    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        hand = new ArrayList<>();
    }

    public void receiveCard(Card card) {
        hand.add(card);
    }

    public void sortHand() {
        hand.sort(Comparator.comparing(card -> card.toString()));
    }

    public void printHand() {
        System.out.println(name + "'s Cards:");
        for (Card card : hand) {
            System.out.println(card);
        }
        System.out.println();
    }
}

class DeckOfCardsWithPlayers {
    private List<Card> deck;

    public DeckOfCardsWithPlayers() {
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

    public void distributeCards(List<Player> players) {
        for (int i = 0; i < 36; i++) {
            players.get(i % players.size()).receiveCard(deck.get(i));
        }
    }
}

public class PlayerManagement {
    public static void main(String[] args) {
        DeckOfCardsWithPlayers deck = new DeckOfCardsWithPlayers();
        deck.shuffle();

        List<Player> players = new ArrayList<>();
        players.add(new Player("Player 1"));
        players.add(new Player("Player 2"));
        players.add(new Player("Player 3"));
        players.add(new Player("Player 4"));

        deck.distributeCards(players);

        for (Player player : players) {
            player.sortHand();
            player.printHand();
        }
    }
}
