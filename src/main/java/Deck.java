import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    String[] suit = {"Hearts", "Clubs", "Spades", "Diamonds"};

    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    ArrayList<String> deckArray = new ArrayList<>();


    public void generateDeck() {

        for (int deckLoop = 0; deckLoop < 6; deckLoop++) {

            for (int b = 0; b < suit.length; b++) {
                for (int i = 0; i < rank.length; i++) {
                    String genCard = rank[i] + " of " + suit[b];
                    deckArray.add(genCard);
                    Collections.shuffle(deckArray);
                    Collections.shuffle(deckArray);
                }
            }
        }
    }

    public void displayDeck() {
        for (int i = 0; i < deckArray.size(); i++)
            System.out.println(deckArray.get(i));
    }

    public int returnDeckSize() {
        return deckArray.size();
    }
}
