package ru.mirea.task2.poker;

import java.util.Scanner;
import java.util.Vector;

public class Poker {
    private static Vector<String> deck;
    private static void fillDeck() {

        deck = new Vector<String>();
        String[] cardSuit = {"Diamonds", "Hearts", "Clubs", "Spades"};
        String[] cardValue = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String suit : cardSuit) {
            for (String value : cardValue) {
                deck.addElement(suit + "_" + value);
            }
        }
    }

    public static void main(String[] args) {

        fillDeck();

        System.out.print("Enter number of players: ");
        Scanner sc = new Scanner(System.in);
        int numberOfPlayers = sc.nextInt();
        int index;

        for (int i = 0; i < numberOfPlayers; i++) {
            for (int j = 0; j < 5; j++) {
                index = (int)(Math.random() * deck.size());
                System.out.print(deck.get(index) + " ");
                deck.remove(index);
                if (deck.isEmpty()) {
                    System.exit(1);
                }
            }
            System.out.println('\n');
        }

    }
}
