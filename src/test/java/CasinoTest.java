import org.junit.Before;
import org.junit.Test;

public class CasinoTest {
    Casino casino;
    Player player;
    Dealer dealer;
    SlotMachine slotMachine;
    BlackJack blackJack;
    CasinoWar casinoWar;
    Deck deck;

    @Before
    public void setUp(){
        player = new Player("Candy", 50000.00);
        dealer = new Dealer("House", 80000.00);
        this.deck = new Deck();
        casinoWar = new CasinoWar(player, dealer, deck);
        blackJack = new BlackJack(player, dealer, deck);
        slotMachine = new SlotMachine(player);
        casino = new Casino(blackJack, casinoWar, slotMachine);
    }

    @Test
    public void canPlayBlackJack() {
        casino.playBlackJack();
    }

    @Test
    public void canCasinoWar(){
        casino.playCasinoWar();
        }

    @Test
    public void canPlaySlotMachine(){
        casino.playSlotMachine();
    }
}
