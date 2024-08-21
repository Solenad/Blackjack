import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private final ArrayList<Card> cardList = new ArrayList<>();

    public final void addCard(Card card) {
        cardList.add(card);
    }

    public final Card drawCard() {
        Random rand = new Random();
        int cardVal = rand.nextInt(0, cardList.size());
        Card card = null;

        if (cardList.get(cardVal) != null) {
            card = cardList.get(cardVal);
            cardList.remove(cardVal);
        }

        return card;
    }

    public final ArrayList<Card> getCardList() {
        return this.cardList;
    }
}
