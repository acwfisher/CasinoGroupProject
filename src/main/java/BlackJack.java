public class BlackJack implements IPlay, IWin {

    private Player player;
    private Dealer dealer;
    private Deck deck;

    public BlackJack(Player player, Dealer dealer, Deck deck){
        this.dealer = dealer;
        this.deck = deck;
        this.player = player;
    }

    public void hitPlayer(){
        // if player hand total < 21 then deal
        // if hand == 21 then win
        // if hand > 21 then lose
        dealer.deal(deck, player);
        changeAceValue(player);
    }


   public int calcHandValue(Player player){
        return player.handValue();
   }


    public void hitDealer() {
        if (dealer.handValue() < 17) {
            dealer.deal(deck, dealer);
            changeAceValue(dealer);
        }
    }

    public void stand(){

    }

    public int changeAceValue(Player player) {
        Card card = player.showCard(0);
//        Card playersSecondCard = player.showCard(1);
        // if its an ace change the value to 11
//        if (playersFirstCard.getRank() == Rank.ACE || playersSecondCard.getRank() == Rank.ACE) {
//            return player.handValue() + 10;
        if (player.handValue() <= 10 && card.getRankValue() == 1) {
            return player.handValue() + 10;
//            if (player.handValue() <= 10 && player.showFullHand().contains("ACE")) {
//                return player.handValue() + 10;
//        } else if (playersFirstCard.getRankValue() == 1 && playersSecondCard.getRankValue() <= 10) {
//            return player.handValue() + 10;
//        } else if (playersFirstCard.getRankValue() == 1 && playersSecondCard.getRankValue() == 1) {
//            return player.handValue() + 10;
        } else {
            return player.handValue();
        }
    }

    public boolean checkBlackJack() {
       if(player.handValue() != 21){
           return true;
    }else {
           System.out.println("BlackJack");
           return false;
       }
    }

    public String checkWinner() {
        String winner = null;
        if ((player.handValue() > dealer.handValue() && (player.handValue() < 21) || player.handValue() == 21)) {
            winner = player.getName();
        }
        else {
            winner = dealer.getName();
        }
        return winner;
    }

//    public boolean checkWinner(Player player) {
//
//            return player.handValue() > dealer.handValue() && (player.handValue()<=21);
//    }

    public void startGame () {
        dealer.deal(deck, player);
        changeAceValue(player);
        dealer.deal(deck, player);
        changeAceValue(player);

        dealer.deal(deck, dealer);
        changeAceValue(dealer);
    }

    public void play () {
        startGame();
        if (checkBlackJack() == false && player.handValue() < 19) {
            hitPlayer();
            checkBust();
        }
        else if (checkBlackJack() == true) {
                checkWinner();
        }
        else {
            stand();
        }
        hitDealer();
        checkWinner();
        System.out.printf("%s WINS 🎉💰 \n", checkWinner());
        }

        public boolean checkBust(){
        if (player.handValue() > 21) {
                System.out.println("Bust!");
                return true;
            }
            else {
                return false;
        }

        }
}
