package com.example.factories.abstractFactory;

import com.example.factories.abstractFactory.Ingredients.Cheese;
import com.example.factories.abstractFactory.Ingredients.Dough;

public interface PizzaIngredientFactory {

    public Dough createDough();

    public Cheese createCheese();
}
