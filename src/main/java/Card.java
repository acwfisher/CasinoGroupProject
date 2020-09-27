public class Card {

    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public int getRankValue(){
        return this.rank.getValue();
    }

    public String getCardName(){
        return String.format("%s of %s", this.rank, this.suit);
    }

}