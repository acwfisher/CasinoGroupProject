public class Casino {

    private BlackJack blackJack;
    private CasinoWar casinoWar;
    private SlotMachine slotMachine;

    public Casino(BlackJack blackJack, CasinoWar casinoWar, SlotMachine slotMachine){
        this.blackJack =  blackJack;
        this.casinoWar =  casinoWar;
        this.slotMachine = slotMachine;
    }

    public void playBlackJack() {
        blackJack.play();
    }

    public void playCasinoWar() {
        casinoWar.play();
    }

    public void playSlotMachine() {
        slotMachine.play();
    }
}
