package com.gla.String.Level3;
import java.util.Scanner;
public class DeckOfCards {
    static String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
    static String[] ranks = {
            "2","3","4","5","6","7","8","9","10",
            "Jack","Queen","King","Ace"
    };

    public static String[] initializeDeck() {

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int randomCard = i + (int)(Math.random() * (n - i));

            String temp = deck[i];
            deck[i] = deck[randomCard];
            deck[randomCard] = temp;
        }
    }

    public static void distribute(String[] deck, int players, int cardsPerPlayer) {

        if (players * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards!");
            return;
        }

        int index = 0;

        for (int i = 0; i < players; i++) {
            System.out.println("\nPlayer " + (i + 1) + " Cards:");
            for (int j = 0; j < cardsPerPlayer; j++) {
                System.out.println(deck[index++]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] deck = initializeDeck();
        shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter cards per player: ");
        int cards = sc.nextInt();

        distribute(deck, players, cards);
    }
}
