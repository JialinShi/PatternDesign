package com.example.template;

public class TestTemplate {

    public static void main(String[] args) {
        BeverageMaking tea = new Tea();
        BeverageMaking coffee = new Coffee();
        BeverageMaking espresso = new Espresso();

        tea.prepareRecipe();
        coffee.prepareRecipe();
        espresso.prepareRecipe();
    }

}
