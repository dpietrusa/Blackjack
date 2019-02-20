import java.util.Scanner;

public class Gameplay {

    Scanner newScanner = new Scanner(System.in);
    Dealer newDealer = new Dealer();


    public void introPrompt() {
        System.out.println("Welcome to Blackjack! Press any key to continue...");
        newScanner.nextLine();
    }

    public void dealCards() {
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

    public void hitOrStay() {
        boolean hitOrStay = true;

        do {
            System.out.println("\nHow would you like to proceed? \n" +
                    "1) Hit \n" +
                    "2) Stay");

            int userInput = newScanner.nextInt();
            int handSum = newDealer.sumPlayersHand();
            System.out.println("Your hand totals " + handSum);
            newDealer.checkIfWinner();

            switch (userInput) {

                case 1: //hit
                    newDealer.addCardToPlayerOneArray();
                    System.out.println("Current Hand:");
                    int newSum = 0;

                    for (int i = 0; i < newDealer.playerOne.size(); i++)
                        System.out.println(newDealer.playerOne.get(i).getRank() + " of " + newDealer.playerOne.get(i).getSuit()
                                + " = " + (newSum += newDealer.playerOne.get(i).getIntRank()));

                    if (newSum < 21) {
                    }
                    if (newSum > 21) {
                        System.out.println("BUST!");
                        hitOrStay = false;
                    }
                    break;

                case 2: //stay
                    hitOrStay = false;
                    break;
            }
        } while (hitOrStay);
    }


    public void revealDealerSecondCard() {

        System.out.println("\nDealers Hand: \n");
        System.out.println(newDealer.dealer.get(0).getRank() + " of " + newDealer.dealer.get(0).getSuit());
        System.out.println(newDealer.dealer.get(1).getRank() + " of " + newDealer.dealer.get(1).getSuit());
        System.out.println("Dealers hand totals " + newDealer.sumDealersHand());

    }

    public void dealerPlay() {

        if (newDealer.sumDealersHand() <= 16) {
            System.out.println("\nDealer's Hand: \n");
            do {
                newDealer.addCardToDealerArray();
                for (int i = 0; i < newDealer.dealer.size(); i++)
                    System.out.println(newDealer.dealer.get(i).getRank() + " of " + newDealer.dealer.get(i).getSuit());
            } while (newDealer.sumDealersHand() <= 16);
            System.out.println("Dealers hand totals " + newDealer.sumDealersHand());
        }
    }

    public void compareValues() {
        if (newDealer.sumPlayersHand() == 21) {
            System.out.println("\nYOU WIN!\n");
        } else if ((21 - newDealer.sumPlayersHand()) < 21 - newDealer.sumDealersHand()) {
            System.out.println("\nYOU LOSE!\n");
        } else if ((newDealer.sumPlayersHand() < 21) && (newDealer.sumDealersHand() > 21)) {
            System.out.println("\nYOU WIN!\n");
        } else System.out.println("\nYOU LOSE!\n");
    }
}




