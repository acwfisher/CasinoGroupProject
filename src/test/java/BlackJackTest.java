import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BlackJackTest {

    BlackJack blackJack;
    Dealer dealer;
    Player player;
    Deck deck;
    Card highCard;
    Card lowCard;
    Card ace;

    @Before
    public void setUp(){
        player = new Player("Freda", 800.00);
        dealer = new Dealer("Ronnie", 400.00);
        deck = new Deck();
        blackJack = new BlackJack(player, dealer, deck);

        highCard = new Card(Suit.SPADES, Rank.KING);
        lowCard = new Card(Suit.SPADES, Rank.TWO);
        ace = new Card(Suit.CLUBS, Rank.ACE);
    }

    @Test
    public void canCreate(){
        assertNotNull(blackJack);
    }

    @Test
    public void canStartGame() {
        blackJack.startGame();
        assertEquals(2, player.cardCount());
        assertEquals(1, dealer.cardCount());
    }

    @Test
    public void canHitPlayer(){
    //Given we have a player and a dealer playing blackjack
    //When the player chooses to hit
        blackJack.hitPlayer();
    //Then the players hand size will increase by 1
        assertEquals(1, player.cardCount());
    // And the deck size will decrease by 1
        assertEquals(51, deck.cardCount());

    }

    @Test
    public void canHitDealer(){
        //Given we have a dealer playing blackjack
        //When it's the dealers turn and the dealers visible hand value total is less than 17
        //Then the dealers hand will increase by 1 card
        blackJack.hitDealer();
        assertEquals(1, dealer.cardCount());
        //AND the deck will decrease by 1 card
        assertEquals(51, deck.cardCount());
    }

    @Test
    public void cantHitDealer(){
        dealer.deal(deck, dealer);
        dealer.deal(deck, dealer);
        dealer.deal(deck, dealer);
        dealer.deal(deck, dealer);
        dealer.deal(deck, dealer);

        blackJack.hitDealer();
        assertEquals(5, dealer.cardCount());
        assertEquals(47, deck.cardCount());

    }
//    @Test
//    public void canCheckWinner(){
//
//        Card card = deck.removeCard();
//        player.addCardToHand(card);
//        Card card3 = deck.removeCard();
//        player.addCardToHand(card3);
//        Card card4 = deck.removeCard();
//        player.addCardToHand(card4);
//
//        Card card2 = deck.removeCard();
//        dealer.addCardToHand(card2);
//
//
//        assertTrue(blackJack.checkWinner(player));
//
//    }
    @Test
    public void canCheckWinner() {
    player.addCardToHand(lowCard);
    dealer.addCardToHand(highCard);
        assertEquals("Ronnie", blackJack.checkWinner());
    }

    @Test
    public void canCalcHandValue(){
        player.addCardToHand(highCard);
        player.addCardToHand(lowCard);
        assertEquals(12, blackJack.calcHandValue(player));
    }

    @Test
    public void canChangeAceValue() {
        player.addCardToHand(ace);
        player.addCardToHand(lowCard);
        assertEquals(13, blackJack.changeAceValue(player));
    }

    @Test
    public void canPlayBlackJack() {
        blackJack.play();
        assertEquals("Freda", blackJack.checkWinner());
    }


}
