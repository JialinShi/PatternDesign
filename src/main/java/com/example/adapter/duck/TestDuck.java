package com.example.adapter.duck;

public class TestDuck {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Turkey turkey = new Turkey();
        Duck adpatedTurkey = new Adapter(turkey);

        mallardDuck.quack();
        mallardDuck.fly();

        turkey.gobble();
        adpatedTurkey.quack();

        turkey.flyShortDistance();
        adpatedTurkey.fly();

    }

}
