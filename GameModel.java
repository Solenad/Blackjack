import java.util.ArrayList;


public class GameModel {

    private final Deck deck = new Deck();
    private Person player;
    private Person dealer;

    public GameModel() {
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

    public final void setDeck() {
        int i, j;
        Card tempCard;

        for (j = 0; j < 1; j++) {
            for (i = 0; i < 11; i++) {
                tempCard = new Card(i + 1);
                this.deck.addCard(tempCard);
            }
        }
    }

    public final void addPlayer(String name) {
        this.player = new Player(name);
    }

    public final void addDealer(String name) {
        this.dealer = new Player(name);
    }

}
