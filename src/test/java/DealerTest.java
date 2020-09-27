import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DealerTest {

    Dealer dealer;
    Deck deck;
    Player player;

    @Before
    public void setUp(){
        dealer = new Dealer("Bob", 800.00);
        deck = new Deck();
        player = new Player("Janet", 500.00);
    }

    @Test
    public void canCreate(){
        assertNotNull(dealer);
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", dealer.getName());
    }

    @Test
    public void canGetMoney(){
        assertEquals(800.00, dealer.getMoney(),0.00);
    }

    @Test
    public void canSetMoney(){
        dealer.setMoney(900.00);
        assertEquals(900.00, dealer.getMoney(),0.00);
    }

    @Test
     public void cardsCanBeDealtFromDeck() {
      //Given we have a dealer and a player
      //And the dealer has a full deck
      //And the player has no cards yet
      //When the dealer deals a card to the player using the deal method
        dealer.deal(deck, player);
      //Then the deck will have 1 less card
        assertEquals(51, deck.cardCount());
      // And the player will have 1 more card
        assertEquals(1, player.cardCount());
    }



}
