//import javax.smartcardio.Card;
import java.util.ArrayList;

public class Dealer {

    Deck newDealerDeck;
    ArrayList<Card> playerOne = new ArrayList<>();
    ArrayList<Card> dealer = new ArrayList<>();


    public void setupDeck() {
        newDealerDeck = new Deck();
        newDealerDeck.generateDeck();
        newDealerDeck.generateNumValueDeck();
        //newDealerDeck.displayDeck();
        //System.out.println("\n" + newDealerDeck.deckArray.get(0));
    }

    public void addCardToPlayerOneArray() {
        playerOne.add(newDealerDeck.deckArray.get(0));
        newDealerDeck.deckArray.remove(0);
        //System.out.println("\n "+ playerOne.size());

    }

    public void addCardToDealerArray() {
        dealer.add(newDealerDeck.deckArray.get(0));
        newDealerDeck.deckArray.remove(0);
        //System.out.println("\n "+ playerOne.size());

    }

    public int sumPlayersHand() {
        int sum = 0;
        for (Card x: playerOne) {
            sum += x.getIntRank();
        }return sum;
    }

    public int sumDealersHand() {
        int sum = 0;
        for (Card x: dealer) {
            sum += x.getIntRank();
        }return sum;
    }

    public void checkIfWinner() {
        int handsum = this.sumPlayersHand();
        if (handsum == 21) {
            System.out.println("You Win");
        } else if (handsum < 21) {

        } else if (handsum > 21) {
            System.out.println("BUST!");
        }
    }





}




