public class Card {

    String suit;
    String rank;
    int intRank;


    public Card(String cardSuit, String cardRank) {
        this.suit = cardSuit;
        this.rank = cardRank;
    }


    public int getIntRank() {
        return intRank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setIntRank(int intRank) {
        this.intRank = intRank;
    }


}
