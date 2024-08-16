import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private final ArrayList<Card> cardList = new ArrayList<>();

    public final void addCard(Card card) {
        this.cardList.add(card);
    }

    public final Card drawCard() {
        Random rand = new Random();

        return cardList.get(rand.nextInt(0, cardList.size() - 1));
    }

    public final ArrayList<Card> getCardList() {
        return this.cardList;
    }


}
