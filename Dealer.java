

public class Dealer extends Person {

    public Dealer(String name) {
        super(name);
    }

    public final boolean revealCardIfHit(Deck deck) {
        if (super.getHandTotal() <= 16) {
            super.addCard(deck.drawCard());
            return true;
        }
        else
            return false;
    }


}