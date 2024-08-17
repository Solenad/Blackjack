import java.util.*;
import java.util.stream.IntStream;


public class GameModel {

    private final Deck deck = new Deck();
    private Person player;
    private Person dealer;

    public GameModel() {
        this.player = new Player("Roe");
        this.dealer = new Dealer("Dealer");
        setDeck();
        setGame();
    }

    // 26 22
    public final String checkWinner() {

        if (player.getHandTotal() == dealer.getHandTotal())
            return "draw";
        else if ((player.getHandTotal() > dealer.getHandTotal() && player.getHandTotal() <= 21) ||
                 (player.getHandTotal() > dealer.getHandTotal() && player.getHandTotal() > 21))
            return "win";
        else if ((player.getHandTotal() < dealer.getHandTotal() && dealer.getHandTotal() <= 21) ||
                 (player.getHandTotal() > dealer.getHandTotal() && player.getHandTotal() > 21))
            return "lose";

        return null;
    }

    private void setDeck() {
        int i, j;
        Card tempCard;

        for (j = 0; j < 1; j++) {
            for (i = 0; i < 11; i++) {
                tempCard = new Card(i + 1);
                this.deck.addCard(tempCard);
            }
        }
    }

    private void setGame() {
        int i = 0, cardValue1, cardValue2;
        Random rand = new Random();
        ArrayList<Integer> tempDeck = new ArrayList<>(IntStream.rangeClosed(1, 12).boxed().toList());

        while (i < 2) {
            cardValue1 = rand.nextInt(1, 12);
            cardValue2 = rand.nextInt(1, 12);

            if (tempDeck.contains(cardValue1) && tempDeck.contains(cardValue2)
                && (cardValue1 != cardValue2)) {
                player.addCard(new Card(cardValue1));
                dealer.addCard(new Card(cardValue2));
                i++;
            }
        }
    }

    // finish here
    public int randCardVal() {

    }

    /*
    public final void addPlayer(String name) {
        this.player = new Player(name);
    }

    public final void addDealer(String name) {
        this.dealer = new Player(name);
    }
    */
}
