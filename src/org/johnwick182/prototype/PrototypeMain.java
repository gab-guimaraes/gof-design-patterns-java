package org.johnwick182.prototype;

public class PrototypeMain {

    /*
    Prototype is a design pattern to clone complex objects without coupling.
    Imagining that you're creating a game with multiple enemies. What would you do to clone them?
    Copy and paste the same attributes for all objects?
    The better way to do that is with prototype pattern.
     */
    public static void main(String[] args) {
        System.out.println("Example of Prototype Java");
        Diablo diablo = new Diablo();
        diablo.atk = 1000;
        diablo.name = "Diablo 1";
        diablo.df = 1500;
        diablo.color = "red";

        Diablo diablo2 = (Diablo) diablo.clone();

        System.out.println(diablo.toString());
        System.out.println(diablo2.toString());


    }
}
