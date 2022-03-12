package org.johnwick182.factory_method;

public class Cheese extends Sandwich {
    public Cheese() {
        this.name = "Cheese";
        this.ingredients.add("bun");
        this.ingredients.add("yellow cheese");
        this.ingredients.add("lettuce");
    }
}
