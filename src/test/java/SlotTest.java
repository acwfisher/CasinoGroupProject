import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SlotTest {

    Slot slot;

    @Before

    public void SetUp() {
        slot = new Slot();
    }

    @Test
    public void testSlot(){
        slot.fillSlot1();
        assertEquals(10, slot.getSlot1().size());
    }

    @Test
    public void getEmoji(){
        slot.fillSlot1();
        assertEquals("🍒", slot.getSlot1().get(1));
    }

    @Test
    public void printEmoji(){
        slot.fillSlot1();
        System.out.println(slot.getSlot1().get(1));
    }

    @Test
    public void testSlot2(){
        slot.fillSlot2();
        assertEquals(10, slot.getSlot2().size());
    }

    @Test
    public void getEmoji2(){
        slot.fillSlot2();
        assertEquals("🍒", slot.getSlot2().get(1));
    }

    @Test
    public void printEmoji2(){
        slot.fillSlot2();
        System.out.println(slot.getSlot2().get(1));
    }

    @Test
    public void testSlot3(){
        slot.fillSlot3();
        assertEquals(10, slot.getSlot3().size());
    }

    @Test
    public void getEmoji3(){
        slot.fillSlot3();
        assertEquals("🍒", slot.getSlot3().get(1));
    }

    @Test
    public void printEmoji3(){
        slot.fillSlot3();
        System.out.println(slot.getSlot3().get(1));
    }


}

