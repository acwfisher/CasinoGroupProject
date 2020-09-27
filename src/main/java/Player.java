import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;
    private double money;
   // private int handValue;

    public Player(String name, double money) {
        this.name = name;
        this.money = money;
        this.hand = new ArrayList<Card>();
      //  this.handValue = handValue;
    }

    public void addCardToHand(Card card){
        hand.add(card);
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

//    public void setHandValue(int handValue){
//        this.handValue = handValue;
//    }

    public int cardCount(){
         return this.hand.size();
     }

     public String showFullHand() {
         String message = null;
         for (Card cards : hand) {
             message = cards.getCardName();

         }
         return message;
     }
     //above method only returns a memory address


    public ArrayList<Card> getHand() {
        return hand;
    }

    public Card showCard(int index){
        return this.hand.get(index);
    }
    //need to not directly access variable in object

    // MUST TEST THESE METHODS
//    public void takeCard(Card card){
//        this.hand.add(card);
//    }

    public int handValue(){
        int total = 0;
        for(Card card : this.hand){
            total += card.getRankValue();
        }
        return total;
    }

}