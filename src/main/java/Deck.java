import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    String[] suit = {"Hearts", "Clubs", "Spades", "Diamonds"};

    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    ArrayList<Card> deckArray = new ArrayList<>();
    ArrayList<Card> deckWithNumValues = new ArrayList<>();

    public void generateDeck() {

        for (int deckLoop = 0; deckLoop < 6; deckLoop++) {

            for (int b = 0; b < suit.length; b++) {
                for (int i = 0; i < rank.length; i++) {
                    Card newCard = new Card(suit[b], rank[i]);
                    deckArray.add(newCard);
                    Collections.shuffle(deckArray);
                    Collections.shuffle(deckArray);
                }
            }
        }
    }

    public void generateNumValueDeck() {

        for (int x = 0; x < deckArray.size(); x++) {
            if (deckArray.get(x).getRank() == "2") {
                deckArray.get(x).setIntRank(2);
            } else if (deckArray.get(x).getRank() == "3") {
                deckArray.get(x).setIntRank(3);
            } else if (deckArray.get(x).getRank() == "4") {
                deckArray.get(x).setIntRank(4);
            } else if (deckArray.get(x).getRank() == "5") {
                deckArray.get(x).setIntRank(5);
            } else if (deckArray.get(x).getRank() == "6") {
                deckArray.get(x).setIntRank(6);
            } else if (deckArray.get(x).getRank() == "7") {
                deckArray.get(x).setIntRank(7);
            } else if (deckArray.get(x).getRank() == "8") {
                deckArray.get(x).setIntRank(8);
            } else if (deckArray.get(x).getRank() == "9") {
                deckArray.get(x).setIntRank(9);
            } else if (deckArray.get(x).getRank() == "10") {
                deckArray.get(x).setIntRank(10);
            } else if (deckArray.get(x).getRank() == "Jack") {
                deckArray.get(x).setIntRank(10);
            } else if (deckArray.get(x).getRank() == "Queen") {
                deckArray.get(x).setIntRank(10);
            } else if (deckArray.get(x).getRank() == "King") {
                deckArray.get(x).setIntRank(10);
            } else if (deckArray.get(x).getRank() == "Ace") {
                deckArray.get(x).setIntRank(11);
            }
        }
    }

    public void displayDeck () {
        for (int i = 0; i < deckArray.size(); i++)
            System.out.println(deckArray.get(i).getRank() + " " + deckArray.get(i).getSuit() + " Value = " +
                    deckArray.get(i).getIntRank());
    }

    public void displayNewDeck () {
        for (int i = 0; i < deckWithNumValues.size(); i++)
            System.out.println(deckWithNumValues.get(i).getRank() + " " + deckWithNumValues.get(i).getSuit() + " " + deckWithNumValues.get(i).getIntRank());
    }

    public int returnDeckSize () {
        return deckArray.size();
    }
}
