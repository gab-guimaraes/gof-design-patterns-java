package org.johnwick182.singleton;

public class SingletonMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("singleton example...");
        System.out.println("getting deck");
        Thread.sleep(1000);
        DeckOfCards.getInstance();
        DeckOfCards.getInstance().printCards();
        System.out.println("remove cards");
        Thread.sleep(1000);
        DeckOfCards.getInstance().getCard();
        DeckOfCards.getInstance().getCard();
        Thread.sleep(1000);
        DeckOfCards.getInstance().printCards();


    }
}
