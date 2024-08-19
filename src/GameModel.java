import java.util.*;
import java.util.stream.IntStream;


public class GameModel {

    private final Deck deck = new Deck();
    private Player player;
    private Dealer dealer;

    public GameModel() {
        this.player = new Player("Roe");
        this.dealer = new Dealer("Dealer");
        setDeck();
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

    public void setDeck() {
        int i;

        for (i = 0; i < 11; i++) {
            deck.addCard(new Card(i + 1));
        }
    }

    public void setGame() {
        int i;

        for (i = 0; i < 2; i++) {
            player.addCard(deck.drawCard());
            dealer.addCard(deck.drawCard());
        }
    }

    public final Deck getDeck() {
        return deck;
    }

    public final Player getPlayer() {
        return player;
    }

    public final Dealer getDealer() {
        return dealer;
    }


}
