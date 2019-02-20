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
        boolean hitOrStay = true;

        do{
            System.out.println("How would you like to proceed? \n" +
                "1) Hit \n" +
                "2) Stay");

        int userInput = newScanner.nextInt();
        int handSum = newDealer.sumPlayersHand();
            System.out.println(handSum);


//        if (handSum =<)

            switch (userInput) {

                case 1:
                    newDealer.addCardToPlayerOneArray();
                    System.out.println("Current Hand:");

                    for (int i = 0; i < newDealer.playerOne.size(); i++)
                        System.out.println(newDealer.playerOne.get(i).getRank() + " of " + newDealer.playerOne.get(i).getSuit());
                    break;

                case 2:
                    hitOrStay = false;
                    break;
            }

        }while (hitOrStay);
    }




    }




