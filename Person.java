import java.util.ArrayList;


class Person {

    private final String name;
    private final ArrayList<Card> cardList = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public final void addCard(Card card) {
        this.cardList.add(card);
    }

    public final int getHandTotal() {
        int total = 0;

        for (Card card : this.cardList)
            total += card.getCardValue();

        return total;
    }

    public final String getName() {
        return name;
    }


}
