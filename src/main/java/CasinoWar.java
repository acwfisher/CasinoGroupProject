public class CasinoWar implements IPlay {

    private Player player;
    private Dealer dealer;
    private Deck deck;


    public CasinoWar (Player player, Dealer dealer, Deck deck) {
        this.player = player;
        this.dealer = dealer;
        this.deck = deck;

    }


    public void startGame() {
        dealer.deal(deck, player);
        dealer.deal(deck, dealer);
    }

    public void play() {
        burn();
        startGame();
        if(checkForDraw() == false){
            checkWinner();
        }
        else burnThree();
        dealer.deal(deck, player);
        burnThree();
        dealer.deal(deck, dealer);

        System.out.printf("%s WINS 🎉💰 \n", checkWinner());


    }
    public boolean checkForDraw(){
        int playerScore = calculateScore(player);
        int dealerScore = calculateScore(dealer);
        if (playerScore == dealerScore) {
            System.out.println("Draw!");
        }
        return(playerScore == dealerScore);
    }



    public String checkWinner() {
        String winner = dealer.getName();
        int playerScore = calculateScore(player);
        int dealerScore = calculateScore(dealer);
        if (playerScore > dealerScore) {
            winner = player.getName();

        }
        return winner;

    }

    public int calculateScore(Player player) {
        Card playersCurrentCard = player.showCard(0);
        // if its an ace change the value 14
        if (playersCurrentCard.getRank() == Rank.ACE) {
            return player.handValue() + 13;
        }
        // if its a king change the value to 13
        if (playersCurrentCard.getRank() == Rank.KING) {
            return player.handValue() + 3;
        }
        // if its a queen change the value to 12
        if (playersCurrentCard.getRank() == Rank.QUEEN) {
            return player.handValue() + 2;
        }
        // if its a jack change the value to 11
        if (playersCurrentCard.getRank() == Rank.JACK) {
            return player.handValue() + 1;
        } else return player.handValue();
    }

    public void burn(){
        this.deck.removeCard();
    }
    public void burnThree(){
       burn();
       burn();
       burn();
    }
}
