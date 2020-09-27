import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CasinoWarTest {

    CasinoWar casinoWar;
    Dealer dealer;
    Player player;
    Deck deck;
    Card losingCard;
    Card ace;
    Card king;
    Card queen;
    Card jack;

    @Before
    public void setUp() {
        player = new Player("Carole", 50000.00);
        dealer = new Dealer("Donnie", 80000.00);
        this.deck = new Deck();
        ace = new Card(Suit.SPADES, Rank.ACE);
        losingCard = new Card(Suit.SPADES, Rank.TWO);
        king = new Card(Suit.HEARTS, Rank.KING);
        queen = new Card(Suit.DIAMONDS, Rank.QUEEN);
        jack = new Card(Suit.DIAMONDS, Rank.JACK);

        casinoWar = new CasinoWar(player, dealer, deck);
    }

    @Test
    public void canCreate() {
        assertNotNull(casinoWar);
    }

    @Test
    public void canStartGame() {
        casinoWar.startGame();
        assertEquals(1, player.cardCount());
        assertEquals(1, dealer.cardCount());
    }

    @Test
    public void canChangeValueOfAce(){
        player.addCardToHand(ace);
        assertEquals(14, casinoWar.calculateScore(player));
    }

    @Test
    public void canChangeValueOfKing(){
        player.addCardToHand(king);
        assertEquals(13, casinoWar.calculateScore(player));
    }
    @Test
    public void canChangeValueOfQueen(){
        player.addCardToHand(queen);
        assertEquals(12, casinoWar.calculateScore(player));
    }
    @Test
    public void canChangeValueOfJack(){
        player.addCardToHand(jack);
        assertEquals(11, casinoWar.calculateScore(player));
    }
    @Test
    public void doesNotChangeValue(){
        player.addCardToHand(losingCard);
        assertEquals(2, casinoWar.calculateScore(player));
    }
    @Test
    public void canBurn(){
        casinoWar.burn();
        assertEquals(51, deck.cardCount());
    }
    @Test
    public void canBurnThree(){
        casinoWar.burnThree();
        assertEquals(49, deck.cardCount());
    }
    @Test
    public void canCheckWinner(){
        player.addCardToHand(king);
        dealer.addCardToHand(queen);
        assertEquals("Carole", casinoWar.checkWinner());
    }

    @Test
    public void checkPlay(){
        casinoWar.play();
        assertEquals("Carole", casinoWar.checkWinner());

    }
    @Test
    public void checkDraw(){
        player.addCardToHand(ace);
        dealer.addCardToHand(ace);
        assertTrue(casinoWar.checkForDraw());
    }
    @Test
    public void checkDrawFail(){
        player.addCardToHand(jack);
        dealer.addCardToHand(ace);
        assertFalse(casinoWar.checkForDraw());
    }
    
    //test checkDraw
}
