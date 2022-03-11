package org.johnwick182.prototype;

public class Diablo extends Enemie {
    public String color;

    public Diablo(){}

    public Diablo(Diablo diablo) {
        super(diablo);
        this.color = diablo.color;
    }

    @Override
    public Enemie clone() {
        return new Diablo(this);
    }

    @Override
    public String toString() {
        return "Diablo{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", atk=" + atk +
                ", df=" + df +
                "} ";
    }
}
