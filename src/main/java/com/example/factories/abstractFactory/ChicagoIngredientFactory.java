package com.example.factories.abstractFactory;

import com.example.factories.abstractFactory.Ingredients.Cheese;
import com.example.factories.abstractFactory.Ingredients.Dough;
import com.example.factories.abstractFactory.Ingredients.Gouda;
import com.example.factories.abstractFactory.Ingredients.HandTossedDough;

public class ChicagoIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new HandTossedDough().createDough();
    }

    @Override
    public Cheese createCheese() {
        return new Gouda().createCheese();
    }
}
