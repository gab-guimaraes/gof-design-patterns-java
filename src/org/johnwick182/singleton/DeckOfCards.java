package org.johnwick182.singleton;
import java.util.Stack;

public class DeckOfCards {
    private final Stack<Card> cardList;

    private static DeckOfCards instance;

    private DeckOfCards() {
        cardList = new Stack<>();
        cardList.add(new Card("Dragon Yellow", 100, 200));
        cardList.add(new Card("Dragon Blue", 100, 200));
        cardList.add(new Card("Magic Mouse", 3400, 200));
        cardList.add(new Card("Roller Atk", 9000, 0));
    }

    public static synchronized DeckOfCards getInstance() {
        if (instance == null) {
            instance = new DeckOfCards();
        }
        return instance;
    }

    public void addCard(Card card) {
        cardList.add(card);
    }

    public Card getCard() {
        return cardList.pop();
    }

    public void printCards() {
        cardList.forEach(e -> {
            System.out.println(e.toString());
        });
    }

}
