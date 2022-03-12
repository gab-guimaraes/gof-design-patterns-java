package org.johnwick182.factory_method;

public class Chicken extends Sandwich {

    public Chicken() {
        this.name = "Chicken";
        this.ingredients.add("bun");
        this.ingredients.add("chicken fried");
        this.ingredients.add("lettuce");
        this.ingredients.add("mostard");
        this.ingredients.add("tomatoes");
    }
}
