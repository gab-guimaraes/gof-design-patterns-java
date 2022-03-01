package org.johnwick182.singleton;

public class Card {
    private String name;
    private int attack;
    private int defese;

    public Card(String name, int attack, int defese) {
        this.name = name;
        this.attack = attack;
        this.defese = defese;
    }

    public void increaseAttack(int value) {
        attack += value;
    }
    public void increaseDefese(int value) {
        defese += value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", defese=" + defese +
                '}';
    }
}
