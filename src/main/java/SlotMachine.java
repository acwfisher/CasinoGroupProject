import java.util.ArrayList;
import java.util.Random;

public class SlotMachine implements IWin {
    private Random randomNumber;
    private ArrayList<String> result;
    private Slot slot;
    private Player player;

//    private ArrayList<Icon> reelOne;
//    private ArrayList<Icon> reelTwo;
//    private ArrayList<Icon> reelThree;


    public SlotMachine(Player player) {
        this.randomNumber = new Random();
        this.result = new ArrayList<String>();
        this.slot = new Slot();
        this.player = player;

//        this.reelOne = new ArrayList<Icon>();
//        this.reelTwo = new ArrayList<Icon>();
//        this.reelThree = new ArrayList<Icon>();
    }

//    public ArrayList<Icon> getReelOne() {
//        return reelOne;
//    }
//
//    public ArrayList<Icon> getReelTwo() {
//        return reelTwo;
//    }
//
//    public ArrayList<Icon> getReelThree() {
//        return reelThree;
//    }

//    public void populateReelOne(Reel reel){
//        reelOne.add(reel);
//        //for (Icon icons : reelOne){
//        //    System.out.println(");
//        System.out.println(reelOne);
//        }



    // compare 3 random numbers
    // if there is a match, print winner
    // if there is not, print loser



    public ArrayList<String> pullLever() {
        result.add(generateIcon1());
        result.add(generateIcon2());
        result.add(generateIcon3());
        return result;
    }


    public String generateIcon1 (){
        int i = randomNumber.nextInt(slot.getSlot1().size());
        return slot.getSlot1().get(i);
    }

    public String generateIcon2 (){
        int j = randomNumber.nextInt(slot.getSlot2().size());
        return slot.getSlot2().get(j);
    }

    public String generateIcon3 (){
        int l = randomNumber.nextInt(slot.getSlot3().size());
        return slot.getSlot3().get(l);
    }


    public void play() {
        pullLever();
        System.out.println("LEVER PULLED 🎰");
        checkWinner();
    }

    public boolean checkResult() {
        String icon1 = pullLever().get(0);
        String icon2 = pullLever().get(1);
        String icon3 = pullLever().get(2);
        System.out.printf(icon1 + " " + icon2 + " " + icon3 + "\n");


        if (icon1 == icon2 && icon2 == icon3)
        {
            return true;
        } else {
            return false;
         }
        }

        public String checkWinner(){
        if (checkResult() == true){
            System.out.printf("%s WINS\n 🎉💰", player.getName());
            return String.format("%s WINS", player.getName());
        }else{
            System.out.printf("%s LOSES ☹️🤮 ", player.getName());
            return String.format("%s LOSES", player.getName());
        }

        }

    }

