import java.util.ArrayList;

public class Dealer extends Player {

    public Dealer(String name, double money) {
        super(name, money);
    }


    public void deal(Deck deck, Player player) {
        Card card = deck.removeCard();
        player.addCardToHand(card);
    }




}
