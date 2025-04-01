package com.example.factories.abstractFactory;

public class ChicagoPizzaStore extends PizzaStore {
    
    public ChicagoPizzaStore(){
        factory = new ChicagoIngredientFactory();
    }


}
