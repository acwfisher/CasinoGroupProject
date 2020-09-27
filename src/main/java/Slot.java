import java.util.HashMap;
import java.util.Random;

public class Slot {
    private HashMap<Integer, String> slot1;
    private HashMap<Integer, String> slot2;
    private HashMap<Integer, String> slot3;

    public Slot() {
        this.slot1 = new HashMap<Integer, String>();
        fillSlot1();
        this.slot2 = new HashMap<Integer, String>();
        fillSlot2();
        this.slot3 = new HashMap<Integer, String>();
        fillSlot3();
    }

    public void fillSlot1() {
        slot1.put(0, "🎲");
        slot1.put(1, "🍒");
        slot1.put(2, "🤪");
        slot1.put(3, "🍌");
        slot1.put(4, "🤑");
        slot1.put(5, "💩");
        slot1.put(6, "🤠");
        slot1.put(7, "🕺");
        slot1.put(8, "👺");
        slot1.put(9, "👽");
    }

    public void fillSlot2() {
        slot2.put(0, "🎲");
        slot2.put(1, "🍒");
        slot2.put(2, "🤪");
        slot2.put(3, "🍌");
        slot2.put(4, "🤑");
        slot2.put(5, "💩");
        slot2.put(6, "🤠");
        slot2.put(7, "🕺");
        slot2.put(8, "👺");
        slot2.put(9, "👽");
    }

    public void fillSlot3() {
        slot3.put(0, "🎲");
        slot3.put(1, "🍒");
        slot3.put(2, "🤪");
        slot3.put(3, "🍌");
        slot3.put(4, "🤑");
        slot3.put(5, "💩");
        slot3.put(6, "🤠");
        slot3.put(7, "🕺");
        slot3.put(8, "👺");
        slot3.put(9, "👽");
    }

    public HashMap<Integer, String> getSlot1() {
        return slot1;
    }

    public HashMap<Integer, String> getSlot2() {
        return slot2;
    }

    public HashMap<Integer, String> getSlot3() {
        return slot3;
    }

}


