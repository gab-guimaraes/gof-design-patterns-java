package org.johnwick182.factory_method;

public class MainSandwich {
    public static void main(String[] args) throws Exception {
        int choice = 1;
        System.out.println("Welcome to the JAVA restaurant");
        System.out.println("You choose the option: " + choice);
        SandwichFactory sandwichFactory = new SandwichFactory();
        Sandwich sandwich = sandwichFactory.createSandwich(2);
        System.out.println("**** MAKING YOUR SANDWICH");
        System.out.println(sandwich.name);
        sandwich.ingredients.forEach(System.out::println);

    }
}
