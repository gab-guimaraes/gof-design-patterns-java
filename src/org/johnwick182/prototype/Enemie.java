package org.johnwick182.prototype;

public abstract class Enemie {
    public String name;
    public int atk;
    public int df;

    public abstract Enemie clone();

    public Enemie() {
    }

    public Enemie(Enemie target) {
        this.name = target.name;
        this.atk = target.atk;
        this.df = target.df;
    }

}
