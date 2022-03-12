package org.johnwick182.factory_method;

public class SandwichFactory extends SandwichFactoryMethod{
    @Override
    public Sandwich createSandwich(int type) throws Exception {
        if (type == 1)
            return new Chicken();
        if (type == 2)
            return new Cheese();
        if (type == 3)
            return new GlutenFree();
        else
            throw new Exception();
        }
}
