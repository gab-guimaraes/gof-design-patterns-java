package org.johnwick182.factory_method;

public class GlutenFree extends Sandwich {
    public GlutenFree() {
        this.name = "Gluten Free";
        this.ingredients.add("bun gluten free");
        this.ingredients.add("cheese");
        this.ingredients.add("ham");
        this.ingredients.add("tomatoes");
        this.ingredients.add("special sauce");
    }
}
