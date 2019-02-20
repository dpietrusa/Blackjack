public class Main {

    public static void main(String[] args) {
//
//    Dealer newDealer = new Dealer();
//    Deck newDeck = new Deck();
//    newDealer.setupDeck();
//    newDealer.addCardToPlayerOneArray();

        Gameplay newGamePlay = new Gameplay();
        newGamePlay.introPrompt();
        newGamePlay.dealCards();
        newGamePlay.hitOrStay();
        newGamePlay.revealDealerSecondCard();
        newGamePlay.dealerPlay();
        newGamePlay.compareValues();






    }
}
