//import javax.smartcardio.Card;
import java.util.ArrayList;

public class Dealer {
    Deck newDealerDeck;
    ArrayList<Card> playerOne = new ArrayList<>();


    public void setupDeck() {
        newDealerDeck = new Deck();
        newDealerDeck.generateDeck();
        newDealerDeck.generateNumValueDeck();
        newDealerDeck.displayDeck();
        //System.out.println("\n" + newDealerDeck.deckArray.get(0));
    }

    public void addCardToPlayerOneArray() {
        playerOne.add(newDealerDeck.deckArray.get(0));
        newDealerDeck.deckArray.remove(0);
        //System.out.println("\n "+ playerOne.size());

    }
}




