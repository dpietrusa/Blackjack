import java.util.ArrayList;

public class Dealer {
    Deck newDealerDeck;


    public void setupDeck(Deck dealerDeck) {
        newDealerDeck = new Deck();
        dealerDeck.generateDeck();
        dealerDeck.generateNumValueDeck();
        dealerDeck.displayDeck();
    }


    public void dealFaceUp() {
        newDealerDeck.deckWithNumValues.get(0);

    }

    public void dealFaceDown() {
        newDealerDeck.deckWithNumValues.get(0);

    }


}
