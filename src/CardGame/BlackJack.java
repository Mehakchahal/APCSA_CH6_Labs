package CardGame;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack
{
    public static void main(String[] args)
    {
        //Constructor
        DeckOfCards BlackJack = new DeckOfCards();

        // Shuffle the cards
        BlackJack.shuffle();

        // Create a dealer hand and a player hand
        ArrayList<Card> playerHand = new ArrayList<>();
        ArrayList<Card> dealerHand = new ArrayList<>();

        // Deal two cards to each hand
        playerHand.add(BlackJack.dealCard());
        dealerHand.add(BlackJack.dealCard());
        playerHand.add(BlackJack.dealCard());
        dealerHand.add(BlackJack.dealCard());

        //Show the 2 hands
        System.out.println("Player: " + playerHand);
        System.out.println("Dealer: " + dealerHand.get(0));
        //Ask the user if they want hit or stay
        System.out.println("Would you like to hit or stay?");
        Scanner scan = new 

    }
}
