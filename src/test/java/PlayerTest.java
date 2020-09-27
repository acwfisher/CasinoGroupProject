import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PlayerTest {
    Player player;
    Dealer dealer;
    Deck deck;

    @Before
    public void setUp(){

        player = new Player("Roxanne", 10000);
        dealer = new Dealer("Bob Ross", 10000000);
        deck = new Deck();

    }

    @Test
    public void canCreate(){
        assertNotNull(player);
    }
    @Test
    public void hasName(){
        assertEquals("Roxanne",player.getName());
    }
    @Test
    public void canGetMoney(){
        assertEquals(10000, player.getMoney(),0.00);
    }
    @Test
    public void canSetMoney(){
        player.setMoney(5000);
        assertEquals(5000, player.getMoney(),0.00);
    }

    @Test
    public void canGetHandValue(){
        dealer.deal(deck, player);
        assertNotNull(player.handValue());
    }

    @Test
    public void canShowHand(){
        dealer.deal(deck, player);
        assertNotNull(player.showFullHand());
    }

    @Test
    public void canShowCard(){
        dealer.deal(deck, player);
        dealer.deal(deck, player);
        assertNotNull(player.showCard(1));
    }
}
