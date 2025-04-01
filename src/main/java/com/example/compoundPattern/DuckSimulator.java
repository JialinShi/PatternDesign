package com.example.compoundPattern;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractFactory factory = new DuckFactory();
        simulator.simulate(factory);
    }
    public void simulate(AbstractFactory factory){
        //创建鸭子
        Quackable mallardDuck = factory.createMallardDuck();
        Quackable redheadDuck = factory.createRedheadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable gooseAdapter = new GooseAdapter(new Goose());

        // 注册监听
        Quackologist quackologist = new Quackologist();


        // 创建鸭子群
        Flock flockOfDuck = new Flock();
        flockOfDuck.addQuacker(mallardDuck);
        flockOfDuck.addQuacker(redheadDuck);
        flockOfDuck.addQuacker(duckCall);
        flockOfDuck.addQuacker(rubberDuck);

        // 创建mallard鸭子群
        Quackable mallardDuck2 = factory.createMallardDuck();
        Quackable mallardDuck3 = factory.createMallardDuck();
        Quackable mallardDuck4 = factory.createMallardDuck();
        Quackable mallardDuck5 = factory.createMallardDuck();

        Flock flockOfMallardDuck =  new Flock();
        flockOfMallardDuck.addQuacker(mallardDuck2);
        flockOfMallardDuck.addQuacker(mallardDuck3);
        flockOfMallardDuck.addQuacker(mallardDuck4);
        flockOfMallardDuck.addQuacker(mallardDuck5);

        // 合并mallard群进入大鸭子群
        flockOfDuck.addQuacker(flockOfMallardDuck);
        flockOfDuck.registerObserver(quackologist);

        simulate(flockOfDuck);
        System.out.println("The duck quacked " + QuackCounter.getCount()+ " times.");
    }
    public void simulate(Quackable quackable){
        quackable.quack();
    }

}
