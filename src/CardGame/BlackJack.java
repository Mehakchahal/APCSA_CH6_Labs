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
            
            public String getPlayerHand() {

    String playerHandString = "";
    for (int i = 0; i < playerHand.size(); i++) {
        playerHandCard = playerHand.get(i);
        card card = new card(playerHandCard.getValue(),
                playerHandCard.getSuit());
        playerHandString += "\n";
        playerHandString += card.getValue();
        playerHandString += "\t";
        playerHandString += card.getSuit();
    }
    return playerHandString;

}

public String getDealerHand() {

    String dealerHandString = "";
    for (int i = 0; i < dealerHand.size(); i++) {
        dealerHandCard = dealerHand.get(i);
        card card = new card(dealerHandCard.getValue(),
                dealerHandCard.getSuit());
        dealerHandString += "\n";
        dealerHandString += card.getValue();
        dealerHandString += "\t";
        dealerHandString += card.getSuit();
    }
    return dealerHandString;
}

public void dealPlayer() {

    playerHand.add(deck.deal());

}

public void dealDealer() {

    dealerHand.add(deck.deal());

}

public String getDealerTopCard() {
    String dealerTopCard = "";
    card cardTop = dealerHand.get(0);
    card card = new card(cardTop.getValue(), cardTop.getSuit());
    dealerTopCard += "\n";
    dealerTopCard += card.getValue();
    dealerTopCard += "\t";
    dealerTopCard += card.getSuit();
    return dealerTopCard;

}
public int getPlayerHandValue() {
    int playerHandValue = 0;        

    for (card a : playerHand) {
        String c = a.getValue();
        if (c.equals("J")) {
            playerHandValue += 10;
        }

        else if (c.equals("Q")) {
            playerHandValue += 10;
        }

        else if (c.equals("K")) {
            playerHandValue += 10;
        }

        else if (c.equals("A")) {
            playerHandValue += 11;
        }

        else {
            playerHandValue += Integer.parseInt(a.getValue());

        }
    }

    int valueOfCards = playerHandValue;
    return valueOfCards;
}

public int getDealerHandValue() {
    int playerHandValue = 0;        

    for (card a : playerHand) {
        String c = a.getValue();
        if (c.equals("J")) {
            playerHandValue += 10;
        }

        else if (c.equals("Q")) {
            playerHandValue += 10;
        }

        else if (c.equals("K")) {
            playerHandValue += 10;
        }

        else if (c.equals("A")) {
            playerHandValue += 11;
        }

        else {
            playerHandValue += Integer.parseInt(a.getValue());

        }
    }

    int valueOfCards = playerHandValue;
    return valueOfCards;
}

public void resetDealerHand() {
    dealerHand.clear();
}

public void resetPlayerHand() {
    playerHand.clear();
}

}
    }
}
