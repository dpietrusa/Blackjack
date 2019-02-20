//import javax.smartcardio.Card;
import java.util.ArrayList;

public class Player {

    ArrayList<Card> playerOne = new ArrayList<>();
    Deck newDeck = new Deck();

    public void addCardToPlayer() {

        playerOne.add(newDeck.deckWithNumValues.get(0));
        newDeck.deckWithNumValues.remove(0);
        System.out.println(playerOne);
    }



    //    public void generateNewPlayer(Card cards){
//        ArrayList<Card> playerOneHand = new ArrayList<>();

//    }
//    public void generateNewPlayer(String name) {
//        this.name = name;
//        ArrayList<Card> playersHand = new ArrayList<>();
//

//    }






}
