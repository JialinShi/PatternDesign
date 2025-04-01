package com.example.factories.abstractFactory;

import com.example.factories.abstractFactory.Ingredients.Cheddar;
import com.example.factories.abstractFactory.Ingredients.Cheese;
import com.example.factories.abstractFactory.Ingredients.Dough;
import com.example.factories.abstractFactory.Ingredients.ThinCrustDough;

public class NYIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        ThinCrustDough dough = new ThinCrustDough();
        return dough.createDough();
    }

    @Override
    public Cheese createCheese() {
        Cheddar cheese = new Cheddar();
        return cheese.createCheese();
    }
}
