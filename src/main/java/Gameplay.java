import java.util.Scanner;

public class Gameplay {

    Scanner newScanner = new Scanner(System.in);
    Dealer newDealer = new Dealer();


    public void introPrompt () {
        System.out.println("Welcome to Blackjack! Press any key to continue...");
        newScanner.nextLine();
    }


    public void dealCards () {
        newDealer.setupDeck();
        newDealer.addCardToPlayerOneArray();
        newDealer.addCardToDealerArray();
        newDealer.addCardToPlayerOneArray();
        newDealer.addCardToDealerArray();

        System.out.println("Players Hand: ");
        System.out.println(newDealer.playerOne.get(0).getRank() + " of " + newDealer.playerOne.get(0).getSuit());
        System.out.println(newDealer.playerOne.get(1).getRank() + " of " + newDealer.playerOne.get(1).getSuit());

        System.out.println("\nDealers Hand: ");
        System.out.println(newDealer.dealer.get(0).getRank() + " of " + newDealer.dealer.get(0).getSuit());

    }

    public void hitOrStay () {




    }



}
