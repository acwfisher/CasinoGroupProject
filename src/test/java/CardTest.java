import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void setup(){
        card = new Card(Suit.HEARTS, Rank.TWO);
    }

    @Test
    public void cardHasRank() {
        assertEquals(Rank.TWO, card.getRank());
    }

    @Test
    public void cardHasSuit() {
        assertEquals(Suit.HEARTS, card.getSuit());
    }

    @Test
    public void cardHasValue(){
        assertEquals(2, card.getRankValue());
    }

    @Test
    public void cardShowsName(){
        assertEquals("TWO of HEARTS", card.getCardName());
    }
}
