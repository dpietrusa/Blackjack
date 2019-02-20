import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//
//    Dealer newDealer = new Dealer();
//    Deck newDeck = new Deck();
//    newDealer.setupDeck();
//    newDealer.addCardToPlayerOneArray();

        Gameplay newGamePlay = new Gameplay();
        Scanner newScanner = new Scanner(System.in);
        int userChoice;

        do {
            newGamePlay.introPrompt();
            newGamePlay.dealCards();
            newGamePlay.hitOrStay();
            newGamePlay.revealDealerSecondCard();
            newGamePlay.dealerPlay();
            newGamePlay.compareValues();

            System.out.println("Would you like to play again? [1] Yes, [2] No");
            userChoice = newScanner.nextInt();

            if (userChoice == 1) {
                newGamePlay.newDealer.playerOne.clear();
                newGamePlay.newDealer.dealer.clear();
            } else break;

        } while (userChoice == 1);
    }
}
