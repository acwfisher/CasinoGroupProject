import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SlotMachineTest {

    SlotMachine slotMachine;
    Slot slot;
    Player player;

    @Before

    public void SetUp(){
        player = new Player("Lolita", 50);
        slotMachine = new SlotMachine(player);
        slot = new Slot();
    }

    @Test

    public void canGenerateIcon1(){
        assertNotNull(slotMachine.generateIcon1());
    }

    @Test

    public void canGenerateIcon2(){
        assertNotNull(slotMachine.generateIcon2());
    }

    @Test

    public void canGenerateIcon3(){
        assertNotNull(slotMachine.generateIcon3());
    }

    @Test

    public void canPullLever(){
        assertEquals(3, slotMachine.pullLever().size());
    }

    @Test

    public void canCheckResult(){
        slotMachine.pullLever();
        assertEquals(false, slotMachine.checkResult());
    }

    @Test

    public void canCheckWinner(){
        slotMachine.pullLever();
        assertEquals("Lolita LOSES", slotMachine.checkWinner());
    }

    @Test

    public void canPlaySlots(){
        slotMachine.play();
    }

    }


